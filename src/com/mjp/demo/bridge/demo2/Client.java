package com.mjp.demo.bridge.demo2;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //发送短信
        MessageImplementor sms = new MessageSMS();
        //发送邮件
        MessageImplementor email = new MessageEmail();

        //普通消息
        AbstractMessage simpleMessage = new SimpleMessage();
        //加急消息
        AbstractMessage urgencyMessage = new UrgencyMessage();

        simpleMessage.setImplementor(sms);
        simpleMessage.sendMessage("test");
        simpleMessage.setImplementor(email);
        simpleMessage.sendMessage("test");

        urgencyMessage.setImplementor(sms);
        urgencyMessage.sendMessage("test");
        urgencyMessage.setImplementor(email);
        urgencyMessage.sendMessage("test");

    }
}
