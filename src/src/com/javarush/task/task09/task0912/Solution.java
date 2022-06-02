package src.com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int num = 0;
        try {
            num = Integer.parseInt("XYZ");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println(num);

        //напишите тут ваш код
    }
}
