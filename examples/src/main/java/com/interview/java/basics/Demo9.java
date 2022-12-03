package com.interview.java.basics;

import org.openjdk.jol.info.ClassLayout;

public class Demo9 {


    public static class D1{
        public static class MyObject{
            private long b;
            private int a;
            private Integer e;

            private static final int s = 1;
            private void f(){}
        }
        public static void main(String[] args){
            System.out.println(ClassLayout.parseInstance(new MyObject()).toPrintable());
        }
    }

}
