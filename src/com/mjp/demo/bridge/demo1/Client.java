package com.mjp.demo.bridge.demo1;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        Implementor implA = new ConcreteImplementorA();

        abstraction.setImpl(implA);
        abstraction.operation();

        System.out.println("----");

        Implementor implB = new ConcreteImplementorB();

        abstraction.setImpl(implB);
        abstraction.operation();
    }
}
