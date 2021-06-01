package jucDXC;

import java.util.concurrent.TimeUnit;

public class Sync{
    String name;
    double balance;
    public synchronized void set(String name, double balance) {
        this.name=name;
        try{
            Thread.sleep(2000);
            System.out.println(balance+"start");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.balance=balance;

       //
    }

    public double get( String name){
        return this.balance;

    }
    public static void main(String[] args) {
         final Sync a = new Sync();
         new Thread(new Runnable() {
             @Override
             public void run() {
                 a.set("aaa", 10.0);
             }
         }).start();
        //sync.set("的方式n",10000);
        try {
            TimeUnit.SECONDS.sleep(1);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(a.get("sa"));
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
