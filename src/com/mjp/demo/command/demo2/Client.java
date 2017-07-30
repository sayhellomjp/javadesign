package com.mjp.demo.command.demo2;

public class Client {

    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建具体的命令
        Command playCommand = new PlayCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        Command backCommand = new BackCommand(audioPlayer);

        //创建请求者
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setStopCommand(stopCommand);
        keypad.setBackCommand(backCommand);

        keypad.play();
        keypad.back();
        keypad.stop();
    }

}
