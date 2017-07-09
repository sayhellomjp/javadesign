package com.mjp.demo.decorator;

/**
 * Created by hahaha on 2017/7/9.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
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
