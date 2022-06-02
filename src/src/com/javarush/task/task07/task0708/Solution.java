package src.com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        reader.close();

        int max = 0;
        for (String s : list){
            if (s.length() > max){
                max = s.length();
            }
        }

        for (String s : list){
            if (s.length() == max){
                System.out.println(s);
            }
        }
    }
}
