package com.mjp.demo.testextend;

public class Apple extends Fruit {

    public Apple(String name) {
        super(name);
    }

    @Override
    public void shape() {
        System.out.println("this is an apple");
    }

}
