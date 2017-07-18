package com.mjp.demo.templatemethod.demo1;

/**
 * Created by HAHAHA on 2017/7/18.
 */
public class ConcreteTemplate2 extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.println("doing test2");
    }

    @Override
    protected void hookMethod() {
        System.out.println("hook 2");
    }

}
