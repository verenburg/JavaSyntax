package src.com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {


    public static void main(String[] args) {
        Man man1 = new Man("Николай",41, "Сталеваров 13 - 68");
        Man man2 = new Man("Николай",38, "Сталеваров 13 - 67");

        Woman woman1 = new Woman("Вероника",41, "Сталеваров 13 - 10");
        Woman woman2 = new Woman("Юлия",41, "Сталеваров 13 - 15");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name,int age, String address){
            this.setName(name);
            this.setAddress(address);
            this.setAge(age);
        }

        public Man(String name, int age){
            new Man(name,age,null);
        }

        public Man(int age){
            new Man(null,age,null);
        }

        public Man(int age, String address){
            new Man(null,age,address);
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getAddress(){
            return this.address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name,int age, String address){
            this.setName(name);
            this.setAddress(address);
            this.setAge(age);
        }

        public Woman(String name, int age){
            new Woman(name,age,null);
        }

        public Woman(int age){
            new Woman(null,age,null);
        }

        public Woman(int age, String address){
            new Woman(null,age,address);
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getAddress(){
            return this.address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
