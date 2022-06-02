package src.com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (String s : array){
            if (isNumber(s)) {
                numbers.add(Integer.parseInt(s));
            }else{
                strings.add(s);
            }
        }

        Collections.sort(numbers);
        Collections.reverse(numbers);

        String[] stringsArr = strings.toArray(new String[0]);

        String[] stringsCopy = stringsArr.clone();
        String temp;
        for (int i = 0; i < stringsCopy.length; i++){
            for (int j = 0; j < stringsCopy.length; j++){
                if(isGreaterThan(stringsCopy[j],stringsCopy[i])){
                    temp = stringsArr[i];
                    stringsArr[i] = stringsArr[j];
                    stringsArr[j] = temp;
                }
            }
        }

        strings = null;
        stringsCopy = null;

        ArrayList<String> list = new ArrayList<>();
        int k = 0;
        while (list.size() < array.length){
            if (k < stringsArr.length){
                list.add(stringsArr[k]);
                k++;
            }
            if (!numbers.isEmpty()){
                list.add("" + numbers.get(0));
                numbers.remove(0);
            }
        }

        for (int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
