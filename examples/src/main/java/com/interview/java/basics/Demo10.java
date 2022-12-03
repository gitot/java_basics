package com.interview.java.basics;

public class Demo10 {

    public static class S1{

        static{
            System.out.println("Outter class loaded");
        }

        private static class Inner{

            static {
                System.out.println("Inner class loaded");
            }
            public static void main(String[] args){
            }
        }



        public static void main(String[] args){
            S1 s = new S1();
        }
    }
}
