package src.com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();

        for (Character s : line.toCharArray()){
            int cifra = Integer.parseInt(s.toString());
            if (cifra % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(" четных цифр " + even);
        System.out.println(" нечетных цифр " + odd);
    }
}
