package baseee;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: ttliu
 * @Date: 2021/4/21 - 04 - 21 - 14:40
 * @Description: baseee
 * @version: 1.0
 */
public class RLTest {
    public static void main(String[] args) {
        String s="asd";
        System.out.println(Math.abs(-80));
        System.out.println(Math.ceil(9.2));
        System.out.println(Math.floor(9.2));
        System.out.println(Math.round(3.5));
        System.out.println(Math.max(2,6));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请按照yyyy-MM-dd的格式输入查看日期");
        String date = scanner.next();
        System.out.println(date);
        java.sql.Date sqlDate=java.sql.Date.valueOf(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sqlDate);

        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int NowDay = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE,1);
       // System.out.println(calendar.getTime()+"是一号吗");
        int num = calendar.get(Calendar.DAY_OF_WEEK);
      //  System.out.println(num);
        //System.out.println(maxDay);
        //第一行空格数量
        for (int i=1;i<num;i++){
            System.out.print("\t");
        }
        //加上空格的天数count
        int count=num-1;
        for (int i=1;i<=maxDay;i++){
            if (i==NowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if (count%7==0){
                System.out.println();
            }

        }



    }
}
