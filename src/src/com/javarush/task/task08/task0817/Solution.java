package src.com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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
        map.put("Новиковf", "Степан");
        map.put("Петров", "Алексей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> namesList = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            namesList.add(pair.getValue());
        }
        ArrayList<String> duplicatesList = new ArrayList<>();
        int count;
        for (String name : namesList){
            count = 0;
            for (String name2 : namesList){
                if (name.equals(name2)) count++;
            }
            if (count > 1) duplicatesList.add(name);
        }

        for (String s : duplicatesList) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
