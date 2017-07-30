package com.mjp.demo.command.demo1;

/**
 * 发起者
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        command.execute();
    }

}
