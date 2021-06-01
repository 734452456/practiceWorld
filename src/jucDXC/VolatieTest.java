package jucDXC;

import java.util.concurrent.TimeUnit;

public class VolatieTest {
   volatile boolean  run=true;
   void m(){
       System.out.println("m start");
       while(run){
            try {
                TimeUnit.SECONDS.sleep(10);
                System.out.println(run+"rrr");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       System.out.println("m end");

    }

    public static void main(String[] args) {
         final VolatieTest t = new VolatieTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
               t.m();
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.run=false;
        System.out.println("*");
    }

}
