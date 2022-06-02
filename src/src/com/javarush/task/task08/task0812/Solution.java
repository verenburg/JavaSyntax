package src.com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list= new ArrayList<>();
        for (int i =0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        reader.close();
        int max = 0;
        int supermax = 0;
        for (int i = 0; i < 9; i++){
            if (list.get(i)==list.get(i+1)) {
                max += 1;
            }else{
                max = 1;
            }
            if (supermax < max) supermax = max;
        }
        System.out.println(supermax);
    }
}
