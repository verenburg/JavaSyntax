package src.com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        reader.close();
        int n = 0;
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            n = list.get(j).length();
            list2.add(n);
        }
        Collections.sort(list2);
        int minLength = list2.get(0);
        int maxLength = list2.get(9);
        list2 = null;

        for (int j = 0; j < 10; j++){
            if (list.get(j).length() == minLength || list.get(j).length() == maxLength) {
                System.out.println(list.get(j));
                break;
            }
        }
    }
}
