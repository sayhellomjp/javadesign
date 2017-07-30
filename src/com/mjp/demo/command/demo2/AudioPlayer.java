package com.mjp.demo.command.demo2;

/**
 * 收音机，相当于请求的接收者
 */
public class AudioPlayer {

    /**
     * 开始播放
     */
    public void play(){
        System.out.println("start...");
    }

    /**
     * 停止播放
     */
    public void stop(){
        System.out.println("stop...");
    }

    /**
     * 回退
     */
    public void back(){
        System.out.println("back...");
    }
}
