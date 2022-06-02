package src.com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int N = Integer.parseInt(reader.readLine());

        for (int i =0; i < N; i++){
            int k = Integer.parseInt(reader.readLine());
            if (maximum < k) maximum = k;
        }

        System.out.println(maximum);
    }
}
