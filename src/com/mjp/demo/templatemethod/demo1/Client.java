package com.mjp.demo.templatemethod.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate template1 = new ConcreteTemplate1();
        template1.templateMethod();

        AbstractTemplate template2 = new ConcreteTemplate2();
        template2.templateMethod();
    }

}
