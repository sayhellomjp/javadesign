package com.mjp.demo.state.demo1;

/**
 * Created by HAHAHA on 2017/7/21.
 */
public class OvertimeState implements State {
    @Override
    public void doJob(Work work) {
        if(work.getHour() < 21){
            System.out.println("当前时间：" + work.getHour() + "，加班中");
        }else{
            //21点强制下班
            work.setState(new RestState());
            work.doJob();
        }
    }
}
