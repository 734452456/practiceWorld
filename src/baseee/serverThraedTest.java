package baseee;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: ttliu
 * @Date: 2021/5/8 - 05 - 08 - 11:24
 * @Description: baseee
 * @version: 1.0
 */
public class serverThraedTest {
    public static void main(String[] args) {
        Socket soc=null;
        InputStream  is=null;
        OutputStream  os=null;
        DataOutputStream dos=null;
        ObjectInputStream ois=null;

        System.out.println("启动服务器");
        ServerSocket ss=null;
        int count=0;
        try{
            ss=new ServerSocket(8088);
            while (true){
                soc = ss.accept();
                new ServerThreads(soc).start();
                count++;
                System.out.println("这是第"+count+"个客户"+soc.getInetAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class ServerThreads extends Thread{
    Socket soc=null;
    InputStream  is=null;
    OutputStream  os=null;
    DataOutputStream dos=null;
    ObjectInputStream ois=null;

    public ServerThreads(Socket soc) {
        this.soc=soc;
    }

    @Override
    public void run() {
        Boolean flag=false;
        try {
            is= soc.getInputStream();
            ois=new ObjectInputStream(is);
            Star star = (Star) (ois.readObject());
            int a = star.getA();
            int b = star.getB();
            if (a==111&b==222){
                flag=true;
            }
            os= soc.getOutputStream();
            dos=new DataOutputStream(os);

            dos.writeBoolean(flag);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }
}
