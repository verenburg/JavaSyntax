package src.com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("коза");
        strings.add("кира");
        strings.add("липа");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        boolean r = false;
        boolean l = false;
        ArrayList<String> result = new ArrayList<>();

        for (String s : strings){
            char[] chars = s.toCharArray();

            for (char c : chars){
                if (c == 'р') r = true;
                if (c == 'л') l = true;
            }

            if ((r && l )||(!r && !l)) result.add(s);
            if (l && !r) {
                s = s + s;
                result.add(s);
            }

            r = false;
            l = false;
        }
        return result;
    }
}