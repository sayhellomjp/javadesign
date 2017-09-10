package com.mjp.demo.decorator.decorator1;

/**
 * Created by hahaha on 2017/7/9.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(ConcreteComponent concreteComponent) {
        super(concreteComponent);
    }

    ////重写operate方法，将自定义方法放在父类的operate方法执行之前执行，用于修饰
    @Override
    public void operate() {
        doingSomething();
        super.operate();
    }

    public void doingSomething(){
        System.out.println("ConcreteDecoratorA decorate something");
    }
}
