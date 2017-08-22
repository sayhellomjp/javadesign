package com.mjp.demo.bridge.demo2;

/**
 * 加急消息
 */
public class UrgencyMessage extends AbstractMessage {

    /**
     * 这里有点像装饰模式，可以在
     * 实际调用发送消息之前加上具体的业务逻辑
     * @param msg
     */
    @Override
    public void sendMessage(String msg) {
        msg += "（这个是加急消息）";
        super.sendMessage(msg);
    }
}
