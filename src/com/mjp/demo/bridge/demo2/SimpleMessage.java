package com.mjp.demo.bridge.demo2;

/**
 * 普通消息
 */
public class SimpleMessage extends AbstractMessage {

    @Override
    public void sendMessage(String msg) {
        //普通消息不做任何处理
        super.sendMessage(msg);
    }
}
