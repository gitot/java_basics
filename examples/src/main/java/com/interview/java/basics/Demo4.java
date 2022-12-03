package com.interview.java.basics;

public class Demo4 {
    public static void main(String[] args) {
        //demo1();

        demo2();

    }

    private static void demo2() {
        int i = 100;
        int j = 100;
        compare(i,j);
    }

    static void compare(Integer i,Integer j){
        Integer a = i + 1;
        Integer b = j + 1;
        System.out.println(a == b);
    }

    private static void demo1() {
        Integer a = 12;
        Integer b = 12;
        Integer c = new Integer(12);
        System.out.println(a==12);
        System.out.println(a==b);
        System.out.println(a==c);
    }
}
