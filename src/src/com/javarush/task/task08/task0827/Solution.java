package src.com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = sdf.parse(date);
        Long d2 = date1.getTime();

        int jahr = date1.getYear() + 1900;
        String NY = "JANUARY 1 " + jahr;
        Date NYdate = sdf.parse(NY);
        Long d1 = NYdate.getTime();
        Long razn = d2-d1;
        System.out.println(razn);
        Long days = razn/(1000*3600*24);
        System.out.println(days);
        return (days % 2 == 0) ? true : false;
    }
}
