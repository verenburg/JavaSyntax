package src.com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        reader.close();

        char[] charArr = string.toCharArray();
        boolean flag = true;
        String s = "";
        for (char c: charArr){
            if (flag) {
                s += String.valueOf(c).toUpperCase();
                flag = false;
            }else{
                s += c;
            }

            if (String.valueOf(c).equals(" ")) flag = true;
        }
        System.out.println(s);
    }
}
