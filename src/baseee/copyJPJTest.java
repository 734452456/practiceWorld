package baseee;

import java.io.*;

/**
 * @Auther: ttliu
 * @Date: 2021/5/6 - 05 - 06 - 15:46
 * @Description: baseee
 * @version: 1.0
 */
public class copyJPJTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\l1390\\Desktop\\截图\\img\\haocun.jpg");
        System.out.println(f1.isFile()+"111is a file");
        File f2 = new File("D:\\COPYhaocun.jpg");
        FileInputStream fi = new FileInputStream(f1);
        FileOutputStream fo = new FileOutputStream(f2);
        BufferedInputStream bi = new BufferedInputStream(fi);
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        byte[] bytes = new byte[1024 * 8];
        int len = fi.read(bytes);
        long start = System.currentTimeMillis();
        while (len!=-1){
            bo.write(bytes,0,len);
            len = fi.read(bytes);
            System.out.println(11111);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start));
        bo.close();
        bi.close();

        fo.close();
        fi.close();


    }
}
