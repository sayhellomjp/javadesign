package com.mjp.demo.chain.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        //创建具体的处理者对象
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        //将handler2指定为1的下一级
        handler1.setSuccessor(handler2);

        handler1.handleRequest();
    }

}
