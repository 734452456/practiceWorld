package baseee;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: ttliu
 * @Date: 2021/4/14 - 04 - 14 - 15:38
 * @Description: baseee
 * @version: 1.0
 */
public class JTTest {

    static  int  sid=30;
    int id=20;

    public String getA() {
        return A;
    }

    String A="asf";

    public int getId() {
        return id;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callableTest callableTest = new callableTest();

        FutureTask<Integer> ft = new FutureTask<>(callableTest);
        Thread thread = new Thread(ft);
        Thread thread1 = new Thread(ft);

        thread.start();
        thread1.start();
        Integer integer = ft.get();
        System.out.println(integer);

    }


/*    @Override
    public String toString() {
        return "JTTest{的" +
                "id=" + id +
                '}';
    }*/
}
