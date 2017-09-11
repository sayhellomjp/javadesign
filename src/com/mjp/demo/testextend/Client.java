package com.mjp.demo.testextend;

public class Client {

    public static void main(String[] args) {
        Fruit orange = new Orange("orange");
        Fruit apple = new Apple("apple");
        orange.shape();
        System.out.println(orange.getName());

        apple.shape();
        System.out.println(apple.getName());

        System.out.println(MjpCup.TEST);
    }

}
