package src.com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> map = new HashMap<>();
        String key = "";
        String value = "";

        while (true){
            key = reader.readLine();
            if (key.isEmpty()) break;
            value = reader.readLine();
            map.put(key,value);
        }

        System.out.println(map);

        String country = reader.readLine();

        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        }else{
            System.out.println("Город не известен");
        }
    }
}
