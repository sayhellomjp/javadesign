package com.mjp.demo.bridge.demo2;

/**
 * 短信消息实现类
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void sendMessage(String msg) {
        System.out.println("发送短信：" + msg);
    }
}
