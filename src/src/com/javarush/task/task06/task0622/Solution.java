package src.com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        /*for (int el: arr) {
            System.out.println(el);
        }*/
        int[] arr2 = new int[5];
        for (int i=0; i<5; i++){
            arr2[i] = arr[i];
        }
        //arr2 = arr;
        Arrays.sort(arr2);
        int max = arr2[4];
        System.out.println(max);
        //System.out.println("-------------------------------");

        for (int el: arr) {
            System.out.println(el);
        }

    }
}
