package com.interview.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Demo15 {
    public static class S1{
        public static void main(String[] args){
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("a","b","c","d"));
            ListIterator<String> lisr = list.listIterator();
            System.out.println(lisr.next());
            lisr.add("x");;
            lisr.add("y");
            System.out.println(lisr.next());

        }
    }
}
