package com.mjp.demo.bridge.demo2;

/**
 * 邮件消息实现类
 */
public class MessageEmail implements MessageImplementor {
    @Override
    public void sendMessage(String msg) {
        System.out.println("邮件信息：" + msg);
    }
}
