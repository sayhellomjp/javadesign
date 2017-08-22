package com.mjp.demo.bridge.demo2;

/**
 * 抽象化角色
 */
public abstract class AbstractMessage {

    //持有发送消息的实现化角色接口
    private MessageImplementor implementor;

    public void setImplementor(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    //实际调用的是实现化角色的发送消息方法
    public void sendMessage(String msg){
        this.implementor.sendMessage(msg);
    }
}
