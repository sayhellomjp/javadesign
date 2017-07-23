package com.mjp.demo.adapter.demo2;

/**
 * 适配器
 */
public class Adapter implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 使用委托的方式完成特殊功能
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
