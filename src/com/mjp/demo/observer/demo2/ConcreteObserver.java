package com.mjp.demo.observer.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者，实现Observer接口
 */
public class ConcreteObserver implements Observer {

    /**
     * 构造方法中订阅主题
     * @param observable
     */
    public ConcreteObserver(Observable observable){
        observable.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者观察到状态改变，为：" + ((ConcreteSubject)o).getData());
    }
}
