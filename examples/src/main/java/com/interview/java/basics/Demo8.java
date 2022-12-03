package com.interview.java.basics;

public class Demo8 {
    public static void main(String[] args) {
       // a();


        String s = "a" + "b";




    }

    private static void a() {
        String a = "abc";
        String b = "def";
        String c = "hij";
        String s = a + b + c;
        System.out.println(s);//底层会调用new StringBuilder().append();
    }

    public static class S1{
        public static void main(String[] args){
//            String a = "abc";
//            System.out.println(a.getBytes().length);

            String b = "王abc争";
            System.out.println(b.getBytes().length);  //9 why?
        }
    }
}
