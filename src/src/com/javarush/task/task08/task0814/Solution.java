package src.com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();

        int[] numb = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 12, 16, 36, 14, 15, 17, 52, 20};
        for (Integer n : numb ) {
            set.add(n);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer n: copy) {
            if (n > 10) set.remove(n);
        }
        return set;
    }

    public static void main(String[] args) {
        Set set = createSet();
        System.out.println(set);
        System.out.println(removeAllNumbersGreaterThan10(set));
    }
}
