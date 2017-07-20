package com.mjp.demo.abstractfactory;

/**
 * 抽象工厂
 */
public interface AbstractFactory {

    /**
     * 创建cpu
     * @return
     */
    public Cpu createCpu();

    /**
     * 创建主板
     * @return
     */
    public Mainboard createMainboard();

}
