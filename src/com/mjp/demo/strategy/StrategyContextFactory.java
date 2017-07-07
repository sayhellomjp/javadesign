package com.mjp.demo.strategy;

/**
 * Created by HAHAHA on 2017/4/14.
 */
public class StrategyContextFactory {

    private Strategy strategy;

    public StrategyContextFactory(String type) {
        if (type.equals("add")) {
            this.strategy = new ConcreteStrategyAdd();
        } else if (type.equals("sub")) {
            this.strategy = new ConcreteStrategySub();
        }
    }

    public void contextDo(){
        strategy.doMath();
    }

}
