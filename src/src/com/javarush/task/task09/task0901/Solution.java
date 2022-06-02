package src.com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        System.out.println(Thread.currentThread().getStackTrace());
        return Thread.currentThread().getStackTrace();
    }
}
