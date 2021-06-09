package com;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: ttliu
 * @Date: 2021/5/18 - 05 - 18 - 13:57
 * @Description: com
 * @version: 1.0
 */
public class testgit{
    public static void main(String[] args) throws ParseException {
        System.out.println(testgit.getMonthDiff("2001-2-21","2011-2-30"));

        System.out.println("hello git");
    }
    public static int getMonthDiff(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1= sdf.parse(date1);
        Date d2= sdf.parse(date2);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        int yearInterval = year1 - year2;
        if (month1 < month2 || month1 == month2 && day1 < day2)
            yearInterval--;
        int monthInterval = (month1 + 12) - month2;
        if (day1 < day2)
            monthInterval--;
        monthInterval %= 12;
        int monthsDiff = Math.abs(yearInterval * 12 + monthInterval);
        return monthsDiff;

    }

}
