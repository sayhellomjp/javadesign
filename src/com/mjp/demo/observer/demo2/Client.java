package com.mjp.demo.observer.demo2;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //新增主题
        ConcreteSubject subject = new ConcreteSubject();

        //新增观察者
        ConcreteObserver observer = new ConcreteObserver(subject);

        //主题对象状态改变

        subject.setData("test2");
        subject.setData("test3");
    }

}
