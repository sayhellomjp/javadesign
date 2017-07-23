package com.mjp.demo.adapter.demo1;

/**
 * 标准实现
 */
public class ConcreteTarget implements Target {


    @Override
    public void request() {
        System.out.println("标准实现");
    }
}
