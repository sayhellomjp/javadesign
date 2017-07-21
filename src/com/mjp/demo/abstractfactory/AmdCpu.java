package com.mjp.demo.abstractfactory;

/**
 * 具体的产品，amd处理器
 */
public class AmdCpu implements Cpu {
    @Override
    public void showMsg() {
        System.out.println("处理器：amd");
    }
}
