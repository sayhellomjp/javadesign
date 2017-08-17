package com.mjp.demo.flyweight.demo1;

/**
 * 具体享元(ConcreteFlyweight)角色
 */
public class ConcreteFlyweight implements Flyweight {

    private String inState = null;

    /**
     * 构造方法，当创建对象时传入内蕴状态值
     * @param inState
     */
    public ConcreteFlyweight(String inState) {
        this.inState = inState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String outState) {
        System.out.println("inState:" + inState);
        System.out.println("outState:" + outState);
    }
}
