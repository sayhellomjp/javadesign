package com.mjp.demo.command.demo2;

/**
 * 键盘按钮，相当于请求者
 */
public class Keypad {

    private Command playCommand;
    private Command stopCommand;
    private Command backCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setBackCommand(Command backCommand) {
        this.backCommand = backCommand;
    }

    //播放
    public void play(){
        playCommand.execute();
    }

    //停止
    public void stop(){
        stopCommand.execute();
    }

    //倒带
    public void back(){
        backCommand.execute();
    }
}
