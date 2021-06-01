package baseee;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: ttliu
 * @Date: 2021/5/8 - 05 - 08 - 10:07
 * @Description: baseee
 * @version: 1.0
 */
public class socketTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("30.16.100.135", 8088);
        System.out.println("client收到连接");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输如用户名");
        int name = scanner.nextInt();
        System.out.println("请输如用户名");
        int pwd = scanner.nextInt();
        Star star = new Star(name,pwd);

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(star);


        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
     boolean  B = dataInputStream.readBoolean();
     if (B==true){
         System.out.println("正确  正确");
     }else{
         System.out.println("密码错误");
     }
        dataInputStream.close();
        inputStream.close();
        oos.close();
        outputStream.close();
        socket.close();
       /* InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 8080);
        System.out.println(isa.getAddress());
        System.out.println(isa.getPort());
        System.out.println(isa.getHostName());
        System.out.println(isa);
        InetAddress address = isa.getAddress();
        System.out.println(address.getHostName());*/
    }
}
 class serverTest{
     public static void main(String[] args) throws IOException, ClassNotFoundException {
         ServerSocket serverSocket = new ServerSocket(8088);
         Socket accept = serverSocket.accept();
         InputStream is = accept.getInputStream();
         ObjectInputStream ois = new ObjectInputStream(is);
         Star star = (Star) (ois.readObject());
         Boolean flag=false;
         int a = star.getA();
         int b = star.getB();
         if (a==111&b==222){
             flag=true;
         }

         DataInputStream dis = new DataInputStream(is);
   /*      String str = dis.readUTF();
         System.out.println("hhhhhh server"+str);*/

         //返回内容
         OutputStream os = accept.getOutputStream();
         DataOutputStream dataOutputStream = new DataOutputStream(os);
         dataOutputStream.writeBoolean(flag);

         dataOutputStream.close();
         os.close();
         dis.close();
         is.close();
         accept.close();
         serverSocket.close();


     }
 }