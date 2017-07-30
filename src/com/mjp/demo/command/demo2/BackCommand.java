package com.mjp.demo.command.demo2;

/**
 * 倒带命令类
 */
public class BackCommand implements Command {

    private AudioPlayer audioPlayer;

    public BackCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.back();
    }

}
