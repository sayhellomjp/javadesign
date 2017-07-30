package com.mjp.demo.mediator.demo1;

/**
 * 抽象的同事类
 */
public abstract class Colleague {

    //持有一个中介者对象
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    //获取中介者对象
    public Mediator getMediator() {
        return mediator;
    }

    //执行某些操作时，需要通知中介者，让中介者去调用被影响的其他同事类
    public abstract void operate();

    //当某一个同事类发生变化时协助其变化
    public abstract void doHelp();
}
