package com.mjp.demo.state.demo1;

/**
 * 早上的工作状态
 */
public class MorningState implements State {
    @Override
    public void doJob(Work work) {
        if(work.getHour() < 12){
            System.out.println("当前时间：" + work.getHour() + "，上午在写代码");
        }else{
            //超过12点转入中午状态
            work.setState(new NoonState());
            work.doJob();
        }
    }
}
