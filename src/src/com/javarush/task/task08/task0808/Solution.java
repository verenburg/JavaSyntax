package src.com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        System.out.println("ArrayList ------------------------");
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        System.out.println("LinkedList -----------------------");
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        Date d0 = new Date();
        for (int i = 0; i < 100000; i++){
            list.add("sss" + i);
        }
        Date d1 = new Date();
        Long delta = d1.getTime() - d0.getTime();
        System.out.println("ins" + delta);
    }

    public static void get10000(List list) {
        Date d0 = new Date();
        for (int i = 0; i < 100000; i++){
            list.get(i);
        }
        Date d1 = new Date();
        Long delta = d1.getTime() - d0.getTime();
        System.out.println("get" + delta);
    }


    public static void set10000(List list) {
        Date d0 = new Date();
        for (int i = 0; i < 100000; i++){
            list.set(i, "sss");
        }
        Date d1 = new Date();
        Long delta = d1.getTime() - d0.getTime();
        System.out.println("set" + delta);
    }

    public static void remove10000(List list) {
        Date d0 = new Date();
        for (int i = 0; i < 100000; i++){
            if (list.isEmpty()) return;
            list.remove(0);
        }
        Date d1 = new Date();
        Long delta = d1.getTime() - d0.getTime();
        System.out.println("rem" + delta);
    }
}
