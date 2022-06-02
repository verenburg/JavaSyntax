package src.com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();
        Human baba1 = new Human("Анна",false, 66);
        Human ded1 = new Human("Аркадий", true,75);
        Human baba2 = new Human("Галя", false, 56);
        Human ded2 = new Human("Витя", true,57);
        Human father = new Human("Слава", true, 33, baba1, ded1);
        Human mother = new Human("Наташа", false, 27, baba2, ded2);
        Human son1 = new Human("Дима", true, 5, mother, father);
        Human son2 = new Human("Макс", true, 3, mother, father);
        Human daughter1 = new Human("Юля", false, 1, mother, father);

        family.add(baba1);
        family.add(ded1);
        family.add(baba2);
        family.add(ded2);
        family.add(father);
        family.add(mother);
        family.add(son1);
        family.add(son2);
        family.add(daughter1);

        for (Human human: family){
            System.out.println(human.toString());
        }

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human mother;
        public Human father;

        Human(String name, boolean sex,int age,Human mother,Human father){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        Human(String name, boolean sex,int age){
            this(name,sex,age,null,null);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}