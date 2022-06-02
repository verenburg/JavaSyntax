package src.com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();

        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Сильвестр");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Новиковf", "Сильвестр");
        map.put("Петров", "Алексей");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;

        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;

        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)) count++;
        }

        return count;

    }

    public static void main(String[] args) {
        Map<String,String> map = createMap();
        System.out.println(map);
        System.out.println(getCountTheSameFirstName(map,"Сильвестр"));
        System.out.println(getCountTheSameLastName(map,"Новиков"));
    }
}
