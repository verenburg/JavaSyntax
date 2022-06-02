package src.com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> deti1 = new ArrayList<>();
        deti1.add(new Human("Настя", false, 5));
        deti1.add(new Human("Кирилл", true, 3));
        deti1.add(new Human("Миша", true, 1));

        ArrayList<Human> deti0 = new ArrayList<>();
        deti0.add(new Human("Маша", false, 35, deti1));
        deti0.add(new Human("Коля", true, 36, deti1));

        Human baba1 = new Human("Света", false, 65, deti0);
        Human ded1 = new Human("Данил", true, 67, deti0);
        Human baba2 = new Human("Валя", false, 62, deti0);
        Human ded2 = new Human("Альберт", true, 68, deti0);
        ArrayList<Human> olds = new ArrayList<>();
        olds.add(baba1);
        olds.add(baba2);
        olds.add(ded1);
        olds.add(ded2);

        ArrayList<Human> family = new ArrayList<>();
        family.addAll(olds);
        family.addAll(deti0);
        family.addAll(deti1);

        for (Human h : family) {
            System.out.println(h);
        }
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = new ArrayList<>();
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            if (!children.isEmpty()) {
                int childCount = this.children.size();
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
