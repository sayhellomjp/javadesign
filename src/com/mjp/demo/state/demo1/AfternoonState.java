package com.mjp.demo.state.demo1;

/**
 * 下午的工作状态
 */
public class AfternoonState implements State {
    @Override
    public void doJob(Work work) {
        if(work.getHour() < 18){
            System.out.println("当前时间：" + work.getHour() + "，下午上班");
        }else{
            //若超过18点并且完成工作则进入休息状态，否则进入加班状态
            if(work.isFinishWork()){
                work.setState(new RestState());
                work.doJob();
            }else{
                work.setState(new OvertimeState());
                work.doJob();
            }
        }
    }
}
