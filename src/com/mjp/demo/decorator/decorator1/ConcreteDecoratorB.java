package com.mjp.demo.decorator.decorator1;

/**
 * Created by hahaha on 2017/7/9.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(ConcreteComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operate() {
        doingSomething();
        super.operate();
    }

    public void doingSomething(){
        System.out.println("ConcreteDecoratorB decorate something");
    }
}
