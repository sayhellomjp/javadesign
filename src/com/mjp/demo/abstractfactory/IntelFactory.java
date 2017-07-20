package com.mjp.demo.abstractfactory;

/**
 * 具体的工厂，intel产品族工厂
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
