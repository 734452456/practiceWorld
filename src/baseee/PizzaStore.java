package baseee;

import java.util.Scanner;

/**
 * @Auther: ttliu
 * @Date: 2021/4/19 - 04 - 19 - 20:15
 * @Description: baseee
 * @version: 1.0
 */
public class PizzaStore {

    public static OOPTest getPizza(int i) {
        Scanner sc = new Scanner(System.in);
        OOPTest pizza=null;
        switch (i){
            case 1:
            {
                System.out.println("输入培根分量：");
                int weight = sc.nextInt();
                System.out.println("输入大小");
                int size = sc.nextInt();
                System.out.println("输入价格：");
                double price = sc.nextDouble();
                BaconPizza bp = new BaconPizza("培根pizza", size, price, weight);
                pizza=bp;
            }
            break;
        }
    return pizza;
    }

}

/**
 * 空白用来测试
 * @Date:
 */

/**
 *  
 * 
 * @author ttliu
 * @date 2021/4/20 17:06
 * @param 
 * @return 
 */


class KongBaiTest{
    public static void main(String[] args) {
        Integer a=10;
        Integer b=new Integer(12);
        int num=b;

       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("第一个数字");
           int num1 = sc.nextInt();
           System.out.println("第二个数字");
           int num2 = sc.nextInt();
           System.out.println("商"+num2/num1);
       }catch (Exception exception){
           System.out.println("输入有问题");
           System.out.println(exception.getMessage());
           System.out.println(exception.toString());
           exception.printStackTrace();
       }


    }

}
