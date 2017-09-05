package com.mjp.demo.innerclass;

public class TestClass3 {

    private String str1 = "normal 1";
    private static String str2 = "static 1";

    public static class StaticInnerClass {
        private String name = "majunpeng";
        private static int age = 26;

        public void display(){
            //不能访问非静态成员和方法
//            System.out.println(str1);
            System.out.println(str2);
        }

    }

    public static void main(String[] args) {
        //静态内部类可以直接通过外部类点内部类来引用内部类的静态属性和方法
        int age = TestClass3.StaticInnerClass.age;

        //对于非静态属性和方法的引用
        new TestClass3.StaticInnerClass().display();

        System.out.println(age);
    }

}
