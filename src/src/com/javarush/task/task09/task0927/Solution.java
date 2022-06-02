package src.com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> map = new HashMap<>();
        map.put("Васька",new Cat("Васька"));
        map.put("Борька",new Cat("Борька"));
        map.put("Пушик",new Cat("Пушик"));
        map.put("Константин",new Cat("Константин"));
        map.put("Семен Семеныч",new Cat("Семен Семеныч"));
        map.put("Артур",new Cat("Артур"));
        map.put("Василиса",new Cat("Василиса"));
        map.put("Лиса",new Cat("Лиса"));
        map.put("Киса",new Cat("Киса"));
        map.put("Пират",new Cat("Пират"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet() ){
            set.add(pair.getValue());
        }

        return set;
        //return new HashSet<>(map.values()); но можно и так!
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
