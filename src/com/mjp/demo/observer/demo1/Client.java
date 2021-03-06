package com.mjp.demo.observer.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //新建主题对象
        Subject subject = new ConcreteSubject();

        //观察者1
        Observer observer1 = new ConcreteObserver();

        //观察者2
        Observer observer2 = new ConcreteObserver();

        //观察者3
        Observer observer3 = new ConcreteObserver2();

        //订阅
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        //主题对象状态改变
        subject.change("状态1");

        System.out.println("------------------");

        //移除观察者1
        subject.removeObserver(observer1);

        subject.change("状态2");
    }

}
