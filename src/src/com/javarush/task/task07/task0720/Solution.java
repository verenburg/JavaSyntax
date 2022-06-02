package src.com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < M; i++){
            strings.add(reader.readLine());
        }

        reader.close();
/*
        System.out.println("-------------------------------------");

        for (int j = 0; j < N; j++){
            strings.add(strings.get(j));
        }

        for (String s: strings) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < N; i++){
            strings.remove(0);
        } */


        for (int j = 0; j < N; j++){
            strings.add(strings.get(0));
            strings.remove(0);
        }

        for (String s2: strings) {
            System.out.println(s2);
        }

    }
}
