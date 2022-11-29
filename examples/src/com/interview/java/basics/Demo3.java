package com.interview.java.basics;

public class Demo3 {
    public static void main(String[] args) {
        Integer a = 10;
        f(a);
        System.out.println(a);
    }

    public static void f(Integer va){
        va = 3;
    }
}
