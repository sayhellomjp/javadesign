package com.mjp.demo.builder;

/**
 * 导演，指挥者，调用具体建造者完成产品的建造
 */
public class Director {

    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品建造方法，完成产品各个零件的建造
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }

}
