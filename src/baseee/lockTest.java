package baseee;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: ttliu
 * @Date: 2021/5/7 - 05 - 07 - 16:16
 * @Description: baseee
 * @version: 1.0
 */
public class lockTest  implements  Runnable{
    ReentrantLock re = new ReentrantLock();
    int tickets=100;

    @Override
    public void run() {

            for (int i=0;i<100;i++) {
                re.lock();
                try{
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName()+"买到了票是第"+tickets--+"张");
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }finally {
                    re.unlock();
                }


            }
    }
}
