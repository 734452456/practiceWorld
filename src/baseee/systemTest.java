package baseee;

import java.io.*;

/**
 * @Auther: ttliu
 * @Date: 2021/5/6 - 05 - 06 - 17:01
 * @Description: baseee
 * @version: 1.0
 */
public class systemTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        InputStream in= System.in;
//        int n = in.read();
//        System.out.println(n);
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("D:\\test\\aa.txt")));
//        dos.writeBoolean(false);
//        dos.writeInt(123);
//        dos.writeUTF("nihhhhhhh");
//        dos.close();
        Star star = new Star(2,3);
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("D:\\test\\aa.txt")));
//        System.out.println(        dis.readBoolean());
//        System.out.println(        dis.readInt());
//        System.out.println(dis.readUTF());
        dis.close();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\test\\aa.txt")));
        oos.writeObject(star);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\test\\aa.txt")));
       Object s= (Object)(ois.readObject());
        System.out.println(s.toString());


    }
}
