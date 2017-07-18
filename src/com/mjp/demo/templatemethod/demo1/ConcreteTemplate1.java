package com.mjp.demo.templatemethod.demo1;

/**
 * 具体模版
 */
public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.println("doing test1");
    }

    @Override
    protected void hookMethod() {
        System.out.println("hook 1");
    }

}
