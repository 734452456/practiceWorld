package baseee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ttliu
 * @Date: 2021/5/7 - 05 - 07 - 15:40
 * @Description: baseee
 * @version: 1.0
 */
public class timeTest {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        while(true){
            Date date = new Date();
            String time = df.format(date);
            System.out.println(time);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
