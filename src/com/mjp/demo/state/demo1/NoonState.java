package com.mjp.demo.state.demo1;

/**
 * 中午的工作状态
 */
public class NoonState implements State {
    @Override
    public void doJob(Work work) {
        if(work.getHour() < 14){
            System.out.println("当前时间：" + work.getHour() + "，中午在午休");
        }else{
            //超过14点转入下午状态
            work.setState(new AfternoonState());
            work.doJob();
        }
    }
}
