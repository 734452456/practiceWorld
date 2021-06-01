package com.ttliu.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: ttliu
 * @Date: 2021/5/8 - 05 - 08 - 15:31
 * @Description: com.ttliu.test
 * @version: 1.0
 */
public class firstTest {
   @Before
   public void init(){
      System.out.println("初始化");
   }



   @Test
   public  void addTest(){
      calculator calculator = new calculator();
      int add = calculator.add(10, 20);
      int c=10;
      int d;

      if (c==10){
         System.out.println("结束把" );
         throw  new Error();
      }
      System.out.println(add);

      Assert.assertEquals(40,add);

      System.out.println("hhhhh");


   }
}

class calculator{
   @Deprecated
   public  int add(int a,int b){
      return a+b;
   }
}