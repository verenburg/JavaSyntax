package src.com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
       int k = 5;
       int[] a = new int[k];
       for (int i=0;  i < k; i++){
           a[i] = Integer.parseInt(reader.readLine());
       }
       int summ = 0;
       for (int n : a){
           summ = summ + n;
       }

       float mid = summ/k;
       float deltamax = 10000;
       int index = 0;

       float delta ;
       for (int i = 0; i < k; i++){
           delta = Math.abs(a[i] - mid);
           if (delta < deltamax) {
               index = i;
               deltamax = delta;
           }
       }

        System.out.println(a[index]);
    }
}
