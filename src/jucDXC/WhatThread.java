package jucDXC;

import java.util.concurrent.TimeUnit;

public class WhatThread{

  static class T1 extends Thread{
      @Override
      public void run() {
          super.run();
          for (int i=0;i<10;i++){
              try{
                  TimeUnit.MICROSECONDS.sleep(1);
              }catch (InterruptedException e){
                  e.printStackTrace();
              }
              System.out.println("ttt111");
          }
      }
  }

    public static void main(String[] args) {
//        new T1().run();
        new T1().start();
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main111");
        }
    }
}
