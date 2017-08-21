package com.mjp.demo.bridge.demo1;

/**
 * 具体实现化角色
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operationImpl() {
        System.out.println("实现A功能");
    }
}
