package com.mjp.demo.classloader.demo;

public class A {

    public A() {
        System.out.println("A的构造方法");
    }

    public static int j = print();

    public static int print() {
        System.out.println("A print");
        return 521;
    }

}
