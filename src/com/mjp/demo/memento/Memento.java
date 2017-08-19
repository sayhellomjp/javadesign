package com.mjp.demo.memento;

/**
 * 备忘录类
 */
public class Memento {

    /**
     * 需要备份的相关数据
     */
    private String state1;
    private String state2;

    /**
     * 创建备忘录时将相关数据导入
     * @param state1
     * @param state2
     */
    public Memento(String state1, String state2) {
        this.state1 = state1;
        this.state2 = state2;
    }

    //取出备份的数据
    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }
}
