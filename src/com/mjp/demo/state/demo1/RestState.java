package com.mjp.demo.state.demo1;

/**
 * 休息的状态
 */
public class RestState implements State {
    @Override
    public void doJob(Work work) {
        System.out.println("当前时间：" + work.getHour() + "，休息");
    }
}
