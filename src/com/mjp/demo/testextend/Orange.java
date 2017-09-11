package com.mjp.demo.testextend;

public class Orange extends Fruit {

    public Orange(String name) {
        super(name);
    }

    @Override
    public void shape() {
        System.out.println("this is a orange");
    }
}
