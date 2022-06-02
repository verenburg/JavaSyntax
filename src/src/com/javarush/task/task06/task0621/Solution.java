package src.com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);
        //catDed.write();

        String babaName = reader.readLine();
        Cat catBaba = new Cat(babaName);
        //catBaba.write();

        String fatherName = reader.readLine();
        Cat catFather = new Cat(catDed, fatherName);
        //catFather.write();

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBaba);
        //catMother.write();

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        //catSon.write();

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);
        //catDaughter.write();

        System.out.println(catDed);
        System.out.println(catBaba);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mama){
            //new Cat(name, mama, null);
            this.name = name;
            this.papa = null;
            this.mama = mama;
        }

        Cat(Cat papa, String name){
            //new Cat(name, null, papa);
            this.name = name;
            this.papa = papa;
            this.mama = null;
        }

        Cat(String name, Cat mama, Cat papa) {
            this.name = name;
            this.papa = papa;
            this.mama = mama;
        }

        Cat(){}

        public void write(){
            System.out.println(this.name);
            System.out.println(this.papa == null ? "Null " : this.papa.name);
            System.out.println(this.mama == null ? "Null " : this.mama.name);
        }

        @Override
        public String toString() {
            String s = "The cat's name is " + this.name + ",";
            s += (papa == null) ? " no father, " : " father is " + this.papa.name + ",";
            s += (mama == null) ? " no mather, " : " mother is " + this.mama.name + ",";
            return s;

        }
    }

}
