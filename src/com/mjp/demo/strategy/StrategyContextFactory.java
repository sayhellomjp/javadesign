package com.mjp.demo.strategy;

/**
 * 这里工厂实际替换了环境角色，将策略的创建变成在工厂由类型判断来创建对应的具体策略
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
