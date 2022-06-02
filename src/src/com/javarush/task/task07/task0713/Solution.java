package src.com.javarush.task.task07.task0713;

import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();*/
        for (int i = 0; i < 20; i++){
            list.add(i);
        }

        ArrayList<Integer> listDiv3 = new ArrayList<>();
        ArrayList<Integer> listDiv2 = new ArrayList<>();
        ArrayList<Integer> listAther = new ArrayList<>();

        boolean print = false;
        for (int j = 0; j < 20; j++) {
            if (list.get(j) % 3 == 0) {
                listDiv3.add(list.get(j));
                print = true;
            }
            if (list.get(j) % 2 == 0) {
                listDiv2.add(list.get(j));
                print = true;
            }
            if (print == false) {
                listAther.add(list.get(j));
            }
            print = false;
        }

            System.out.println(" массив чисел которые делятся на 3");
            printList(listDiv3);
            System.out.println(" массив чисел которые делятся на 2");
            printList(listDiv2);
            System.out.println(" массив всех остальных чисел");
            printList(listAther);
        }

    public static void printList(ArrayList<Integer> list) {
        for (int el : list){
            System.out.println(el);
        }
    }
}
