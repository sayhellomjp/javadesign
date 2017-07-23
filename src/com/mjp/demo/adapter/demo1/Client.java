package com.mjp.demo.adapter.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        //标准接口实现
        Target target1 = new ConcreteTarget();
        target1.request();

        //通过适配器实现标准接口
        Target target2 = new Adapter();
        target2.request();
    }

}
