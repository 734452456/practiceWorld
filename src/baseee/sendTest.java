package baseee;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Auther: ttliu
 * @Date: 2021/5/8 - 05 - 08 - 13:57
 * @Description: baseee
 * @version: 1.0
 */
public class sendTest {
    public static void main(String[] args) throws IOException {
        System.out.println("老师你好");
        DatagramSocket ds = new DatagramSocket(8888);
        try {
            while (true){
                String str="kskskads多个";
                byte[] bytes=str.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 9999);
                ds.send(dp);

                byte[] bytes1=new byte[1024];
                DatagramPacket dp1 = new DatagramPacket(bytes1, bytes1.length);
                ds.receive(dp1);
                byte[] data = dp1.getData();
                String s = new String(data, 0, data.length);
                System.out.println("老师说："+s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            ds.close();
        }




    }
}

class  serviceTest{
    public static void main(String[] args) throws IOException {
        System.out.println("学生你好");

        DatagramSocket ds = new DatagramSocket(9999);
        try{
            while (true){
                byte[] bytes=new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                ds.receive(dp);
                byte[] data = dp.getData();
                String s = new String(data, data.length);
                System.out.println("学生说"+s);

                Scanner sc = new Scanner(System.in);
                System.out.print("老师说：");
                String sc1 = sc.next();
                byte[] bytes1 = sc1.getBytes();
                DatagramPacket dp1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("localhost"), 8888);
                ds.send(dp1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }





    }
}
