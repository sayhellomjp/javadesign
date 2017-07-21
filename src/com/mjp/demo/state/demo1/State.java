package com.mjp.demo.state.demo1;

/**
 * 工作状态的接口
 */
public interface State {

    /**
     * 工作的方法
     * @param work
     */
    public void doJob(Work work);

}
