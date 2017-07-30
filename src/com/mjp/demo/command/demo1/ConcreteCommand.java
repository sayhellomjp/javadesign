package com.mjp.demo.command.demo1;

/**
 * 具体的命令类
 */
public class ConcreteCommand implements Command {

    //声明接收者对象
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //真正执行的是Receiver中的方法
        receiver.doSomething();
    }
}
