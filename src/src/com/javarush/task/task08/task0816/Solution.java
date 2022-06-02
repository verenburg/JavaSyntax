package src.com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Сидоров", dateFormat.parse("JUNE 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 1 2012"));
        map.put("Сазонтов", dateFormat.parse("JULY 1 2012"));
        map.put("Михайлов", dateFormat.parse("MARCH 1 2012"));
        map.put("Кушнер", dateFormat.parse("MAY 1 2012"));
        map.put("Самарина", dateFormat.parse("JULY 1 2012"));
        map.put("Валентинов", dateFormat.parse("JANUARY 1 2012"));
        map.put("Уколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Костарева", dateFormat.parse("FEBRUARY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
       Map<String, Date> copy = new HashMap<>(map);
       for (Map.Entry<String, Date> pair : copy.entrySet()){
           if (pair.getValue().getMonth()==5 || pair.getValue().getMonth()==6 || pair.getValue().getMonth()==7){
               map.remove(pair.getKey());
           }
       }
    }

    public static void main(String[] args) throws ParseException{
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
