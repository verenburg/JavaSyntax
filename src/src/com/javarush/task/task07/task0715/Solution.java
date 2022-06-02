package src.com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("мама", "мыла", "раму"));

        for (int i = 0; i < 3; i++){
            list.add(i*2+1, "именно");
        }

        for (String s : list){
            System.out.println(s);
        }

    }
}
