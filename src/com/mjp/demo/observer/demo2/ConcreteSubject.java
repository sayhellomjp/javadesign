package com.mjp.demo.observer.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * 主题对象，继承Observable类
 */
public class ConcreteSubject extends Observable {


    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
