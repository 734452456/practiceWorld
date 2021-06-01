package baseee;

import java.util.concurrent.FutureTask;

/**
 * @Auther: ttliu
 * @Date: 2021/5/7 - 05 - 07 - 13:45
 * @Description: baseee
 * @version: 1.0
 */
public class joinTest {
    public static void main(String[] args) throws InterruptedException {
        callableTest callableTest = new callableTest();
        FutureTask ft = new FutureTask<>(callableTest);
        Thread t1 = new Thread(ft);
        t1.setDaemon(true);
//        thAZCSTest thAZCSTest = new thAZCSTest();
//        Thread t2 = new Thread(thAZCSTest);
//        t2.start();
//        t2.join();
        t1.start();
        for(int i=0;i<10;i++)
        {
            if(i==6){
                Thread.currentThread().stop();
            }
            System.out.println(i+"main");
        }


    }
}
