package com.interview.java;

import java.util.Arrays;
import java.util.List;
import java.util.jar.Pack200;

public class GenericDemo {

    //泛型方法，方法只能是静态的。
    public static <T> void hello(T t){

    }

    //泛型类。类中有个元素的类型不确定。
    class Hello<T>{
        public void hello(T t){

        }
    }


    interface Super<T>{
        T demo();
    }

    //不制定泛型，默认使用Object.
    class Demo3 implements Super{

        @Override
        public Object demo() {
            return null;
        }
    }
    //不具体化类型，子类实力化时确定类型。
    class Demo<T> implements Super<T> {

        @Override
        public T demo() {
            return null;
        }
    }

    //具体化泛型类型。
    class Demo2 implements Super<String>{

        @Override
        public String demo() {
            return null;
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(new Child()));
    }

    public static void test(List<? extends Parent> parent){

    }

    static class Parent{

    }

    static class Child extends Parent {}
}
