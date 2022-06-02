package src.com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();

        map.put("Смирнов", 499);
        map.put("Иванов", 550);
        map.put("Кузнецов", 11100);
        map.put("Соколов", 900);
        map.put("Попов", 300);
        map.put("Лебедев", 800);
        map.put("Новиков", 500);
        map.put("Козлов", 6400);
        map.put("Новиковf", 600);
        map.put("Петров", 200);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String,Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map map = createMap();
        removeItemFromMap(map);
        for (Object pair : map.entrySet()){
            System.out.println(pair);;
        }
    }
}