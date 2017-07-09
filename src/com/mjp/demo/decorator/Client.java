package com.mjp.demo.decorator;

/**
 * Created by hahaha on 2017/7/9.
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.operate();
        int a = 1;
        a = 2;
    }
}
