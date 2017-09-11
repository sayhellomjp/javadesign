package com.mjp.demo.testextend;

public abstract class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public abstract void shape();

    public String getName() {
        return name;
    }

}
