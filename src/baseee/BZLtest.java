package baseee;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: ttliu
 * @Date: 2021/4/21 - 04 - 21 - 10:21
 * @Description: baseee
 * @version: 1.0
 */
public class BZLtest {
    public static void main(String[] args) {
        Integer i1 = new Integer(6);
        Integer i2 = new Integer(12);
        int c1 = i1.compareTo(i2);
        System.out.println(c1);
        String a="12";
        String b="10";
        int c2 = a.compareTo(b);
        System.out.println(c2);
        System.currentTimeMillis();



    }
}
class DateText{
    public static void main(String[] args) {
//        Date date1 = new Date();
//        System.out.println(date1.getTime());
//        System.out.println(date1);
//
//        java.sql.Date date2= new java.sql.Date(date1.getTime());
//
//        System.out.println(date2);
//        java.sql.Date date=java.sql.Date.valueOf("2015-9-24");
//        System.out.println(date);
//       java.util.Date utilDate=date2;
//        System.out.println(utilDate);
        long id = System.currentTimeMillis();
        java.sql.Timestamp sqltime=new Timestamp(id);
        System.out.println(sqltime);

        java.util.Date utiltime=sqltime;
        System.out.println(utiltime);

        SimpleDateFormat ftime=new SimpleDateFormat("yyyy-MM-dd");
        String format = ftime.format(sqltime);
        System.out.println(format);

        GregorianCalendar cal = new GregorianCalendar();
        Calendar cal1=cal;
        Calendar cla2 = Calendar.getInstance();

        cla2.setTime(sqltime);
        System.out.println( cla2.getTime());
        System.out.println(cal1.getTime());

       System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
//        System.out.println(cal1.get(Calendar.WEEK_OF_MONTH));
//        System.out.println(cal1.getActualMaximum(Calendar.DATE));
    }

}
