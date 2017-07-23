package com.mjp.demo.adapter.demo1;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 适配器继承了被适配对象，同时实现了标准接口，可以重写的方法中调用父类（Adaptee）的方法，完成适配
     */
    @Override
    public void request() {
        super.specificRequest();
    }
}
