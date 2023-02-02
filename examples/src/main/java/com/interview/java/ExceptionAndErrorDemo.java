package com.interview.java;

public class ExceptionAndErrorDemo {
    public static void main(String[] args) {
        try {
            hello();
        } catch (Throwable e) {
            System.out.println("exception catch block");
            e.printStackTrace();
            System.exit(1);
        } finally {
            System.out.println("finally");
        }
    }

    private static void hello() {
        throw new Error();
    }
}
