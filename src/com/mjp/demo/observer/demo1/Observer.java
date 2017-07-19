package com.mjp.demo.observer.demo1;

/**
 * 抽象的观察者角色
 */
public interface Observer {

    /**
     * 更新的接口，由主题角色调用，当主题角色状态发生改变时，
     * 将调用所有订阅者的update方法，并将更新后的状态作为参数传入
     * @param state
     */
    public void update(String state);

}
