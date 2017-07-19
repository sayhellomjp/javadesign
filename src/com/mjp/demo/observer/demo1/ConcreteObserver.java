package com.mjp.demo.observer.demo1;

/**
 * 具体的观察者对象
 */
public class ConcreteObserver implements Observer {

    private String state;

    @Override
    public void update(String newState) {
        state = newState;
        System.out.println("观察者对象改变：" + newState);
    }
}
