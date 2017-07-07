package com.mjp.demo.strategy;

/**
 * 环境角色，持有Strategy的引用
 */
public class StrategyContext {

    private Strategy strategy;

    /**
     * 构造函数传入具体的Strategy实现类
     * @param strategy
     */
    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextDo(){
        strategy.doMath();
    }

}
