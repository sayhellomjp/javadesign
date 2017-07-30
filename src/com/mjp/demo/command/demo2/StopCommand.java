package com.mjp.demo.command.demo2;

/**
 * 停止播放名另类
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
