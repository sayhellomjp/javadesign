package com.mjp.demo.strategy;

/**
 * Created by HAHAHA on 2017/4/14.
 */
public class TestMain {

    public static void main(String[] args) {
        //客户端需要知道具体的策略类，这意味着客户端需要知道所有的策略方法以及他们之间的区别
//        ConcreteStrategyAdd add = new ConcreteStrategyAdd();
//        StrategyContext context = new StrategyContext(add);
//        context.contextDo();

        //简单工厂模式和策略模式相结合，将创建具体策略的任务交给工厂，客户端只需要知道StrategyContextFactory这个类
        StrategyContextFactory f = new StrategyContextFactory("add");
        f.contextDo();
    }

}
