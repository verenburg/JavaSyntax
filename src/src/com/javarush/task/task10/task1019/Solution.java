package src.com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id = 0;
        String name = "";
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name,id);
            } catch (Exception e) {
                for (Map.Entry<String, Integer> pair : map.entrySet()) {
                    id = pair.getValue();
                    name = pair.getKey();
                    System.out.println("Id=" + id + " Name=" + name);
                }
            }
        }
    }
}
