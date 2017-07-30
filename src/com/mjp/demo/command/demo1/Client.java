package com.mjp.demo.command.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //接收者对象
        Receiver receiver = new Receiver();

        //命令对象
        Command command = new ConcreteCommand(receiver);

        //发起者对象
        Invoker invoker = new Invoker(command);

        invoker.action();
    }

}
