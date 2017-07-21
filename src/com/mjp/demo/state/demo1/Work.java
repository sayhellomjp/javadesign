package com.mjp.demo.state.demo1;

/**
 * 工作类，包含了State状态的引用，实际就是标准结构中的环境类Context
 */
public class Work {

    //状态
    private State state;

    //是否完成工作，若完成可以由下午工作状态或加班工作状态转入休息工作状态
    private boolean finishWork;

    //工作的当前时间，小时
    private int hour;

    public Work(){
        //默认初始化早上的工作状态
        finishWork = false;
        hour = 9;
        state = new MorningState();
    }

    /**
     * 这里相当于代理，调用传入进来的工作状态State的doJob方法，把本身的实例作为参数传入
     */
    public void doJob(){
        state.doJob(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isFinishWork() {
        return finishWork;
    }

    public void setFinishWork(boolean finishWork) {
        this.finishWork = finishWork;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
