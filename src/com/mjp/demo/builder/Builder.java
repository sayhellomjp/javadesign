package com.mjp.demo.builder;

/**
 * 建造者接口，定义了建造产品需要实现的方法
 */
public interface Builder {

    /**
     * 创建产品的第一部分
     */
    public void buildPart1();

    /**
     * 创建产品的第二部分
     */
    public void buildPart2();

    /**
     * 返回产品
     */
    public Product getResult();

}
