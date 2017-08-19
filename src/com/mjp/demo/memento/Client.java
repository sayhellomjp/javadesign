package com.mjp.demo.memento;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //创建一个发起人
        Originator originator = new Originator();
        originator.setState1("mjp");
        originator.setState2("rtt");
        originator.show();

        //创建一个管理者
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //状态改变
        System.out.println("---状态改变---");
        originator.setState1("马俊鹏");
        originator.setState2("任婷婷");
        originator.show();

        //状态恢复
        System.out.println("---状态恢复---");
        originator.resetMemento(caretaker.getMemento());
        originator.show();
    }

}
