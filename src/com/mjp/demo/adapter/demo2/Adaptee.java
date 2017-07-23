package com.mjp.demo.adapter.demo2;

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("不标准实现，特殊实现");
    }

}
