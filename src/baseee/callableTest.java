package baseee;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Auther: ttliu
 * @Date: 2021/5/7 - 05 - 07 - 11:23
 * @Description: baseee
 * @version: 1.0
 */
public class callableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i=0;i<100;i++){
            System.out.println(i+"子线程");
        }
        return new Random().nextInt(10);
    }
}
/*
 *  
 * 
 * @author ttliu
 * @date 2021/5/7 16:16
 * @param 
 * @return
 */
class thAZCSTest extends Thread{
    @Override
    public void run() {
        for (int i=10;i<20;i++){
            System.out.println(i+"子线程");
        }
        super.run();
    }
}
