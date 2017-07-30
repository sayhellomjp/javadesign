package com.mjp.demo.mediator.demo1;

/**
 * 具体的同事类
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doHelp() {
        System.out.println("同事类B正在协助");
    }

    /**
     * 执行某些操作时，需要通知中介者，让中介者去调用被影响的其他同事类
     */
    public void operate(){
        getMediator().change(this);
    }
}
