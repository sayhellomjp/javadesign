package com.mjp.demo.classloader.demo;

public class Test1 extends A {

    public Test1() {
        System.out.println("Test1的构造方法");
    }

    public static int k = print();

    public static int print() {
        System.out.println("Test print");
        return 522;
    }

    public static void main(String[] args) {
        System.out.println("main start");
        Test1 t1 = new Test1();
    }

}
