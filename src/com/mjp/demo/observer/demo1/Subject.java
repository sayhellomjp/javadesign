package com.mjp.demo.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的主题(被观察)角色
 */
public abstract class Subject {

    /**
     * 保存的观察者集合
     */
    private List<Observer> observerList;

    public Subject(){
        observerList = new ArrayList();
    }

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知方法，通知所有观察者
     * @param newState
     */
    public void notifyObservers(String newState){
        for(Observer observer: observerList){
            observer.update(newState);
        }
    }

    public abstract void change(String newState);

}
