package jucDXC;

import java.util.Scanner;

public class learnTest
{
    public static void main(String[] args) {
        char a='\n';
        char a1='\b';
        char c='\\';
        char a4='\"';
        char  a3='\r';
        final double pi=3.14;
       // Scanner scanner=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("输入半斤：");
        double r=sc.nextInt();
        double size=pi*r*r;
        System.out.println(size);
        System.out.println("身高：");
        double height=sc.nextDouble();
        int age =sc.nextInt();
        System.out.println("hhh/n"+height);
        String q="safasfa";
        char at=q.charAt(4);
        System.out.println("charAt(0):"+at);

/*        System.out.println("Miho"+a3+"aaa");
         String b="你\r骄\n傲";
        System.out.println(b);
        System.out.println("aaa\bfa");*//*
        char ch6 = '2'+2;
        System.out.println(ch6);//'4'--->4
        System.out.println(ch6+2); //  ascii码的54   对应数字6
        char  c1= '6'+5;        System.out.println(c1);
        char ch=(char)65;
        System.out.println(ch);
        char ch3='中';
        int  z=(int)ch3;
        System.out.println(ch3);
        System.out.println(ch3-90);
        System.out.println(z);
        int aa=20013;
        char aa1=(char)aa;
        System.out.println(aa1);*/

        double d=1+1.8+299+8.5f+'a';
        System.out.println(d);

    }
}
