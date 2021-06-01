package baseee;

import java.io.File;

/**
 * @Auther: ttliu
 * @Date: 2021/4/26 - 04 - 26 - 19:59
 * @Description: baseee
 * @version: 1.0
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("D:\\test\\a");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getAbsolutePath());
        boolean d = f1.delete();
        System.out.println(d+"是否成功删除");
        File f2 = new File("D:\\test\\a\\b");
        if (f2.exists()){
            System.out.println(f2.canRead()+"222");
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }else {
            f2.mkdirs();
            System.out.println(f2.exists()+"222创建？？？？");
        }
         String[] a={"c","d","3"};
        for (int i=0;i<a.length;i++
             ) {
            System.out.println(a[i]);
            String x="D:\\test\\"+a[i];
            System.out.println(x);
            File f3 = new File(x);
            boolean is = f3.mkdir();
            System.out.println(is+"333is  ???");
        }



    }


}
