package src.com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("-----------");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();

        for (int i = 0; i < 4; i++){
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();

        for (int i = 0; i < 3; i++){
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat cat: cats){
            if (pets.contains(cat)) pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet: pets) {
            System.out.println(pet);
        }
    }

    public static class Cat{

    }

    public static class Dog{

    }
}
