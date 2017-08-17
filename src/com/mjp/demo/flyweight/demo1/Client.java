package com.mjp.demo.flyweight.demo1;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.factory("a");
        Flyweight flyweight2 = factory.factory("b");
        Flyweight flyweight3 = factory.factory("a");

        flyweight1.operation("111");
        flyweight2.operation("222");
        flyweight3.operation("333");
    }
}
