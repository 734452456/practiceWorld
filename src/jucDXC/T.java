package jucDXC;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class T {
    public boolean run;
    int count=0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+"start");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+"count=="+count);
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException E){
                E.printStackTrace();
            }
            if (count==5){
                int i=1/0;
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy/MM/dd");
        String datetime = tempDate.format(new Date());
        System.out.println(datetime+"ddddd");

         Calendar cal=Calendar.getInstance();
        int i = cal.get(Calendar.YEAR);
        int i1 = cal.get(Calendar.MONTH);
        int i2 = cal.get(Calendar.DATE);
        System.out.println(i+"/"+i1+"/"+i2+" \tfsgfasfasfas");
        System.out.println(cal+"calcal");

        final T t = new T();
        final Runnable r = new Runnable() {

            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(r ,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(r,"t2").start();



    }
}
