package com.mjp.demo.memento;

/**
 * 发起人类
 */
public class Originator {

    //需要保存的属性
    private String state1;
    private String state2;

    /**
     * 创建备忘录，将当前需要保存的数据导入并创建一个备忘录对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(state1, state2);
    }

    /**
     * 恢复数据，将备忘录导入并回复数据
     * @param memento
     */
    public void resetMemento(Memento memento){
        this.state1 = memento.getState1();
        this.state2 = memento.getState2();
    }

    public void show(){
        System.out.println("state1:" + state1);
        System.out.println("state2:" + state2);
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }
}
