package com.mjp.demo.observer.demo1;

/**
 * 具体的主题对象
 */
public class ConcreteSubject extends Subject {

    /**
     * 状态
     */
    private String state;

    public String getState() {
        return state;
    }

    /**
     * 状态改变方法，通知所有的观察者
     * @param newState
     */
    @Override
    public void change(String newState){
        this.state = newState;
        System.out.println("主题角色状态改变：" + newState);
        super.notifyObservers(newState);
    }

}
