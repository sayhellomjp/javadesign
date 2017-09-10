package com.mjp.demo.decorator.decorator1;

/**
 * Created by hahaha on 2017/7/9.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.operate();
    }
}
