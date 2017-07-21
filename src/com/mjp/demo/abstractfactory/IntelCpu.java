package com.mjp.demo.abstractfactory;

/**
 * 具体的产品，intel处理器
 */
public class IntelCpu implements Cpu {
    @Override
    public void showMsg() {
        System.out.println("处理器：intel");
    }
}
