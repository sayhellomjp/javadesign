package com.mjp.demo.bridge.demo1;

/**
 * 抽象化角色类，它声明了一个方法operation()，并给出了它的实现。
 * 这个实现是通过向实现化对象的委派(调用operationImpl()方法)实现的。
 */
public abstract class Abstraction {

    //持有一个实现化(Implementor)角色接口
    private Implementor impl;

    public Implementor getImpl() {
        return impl;
    }

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    //示例方法
    public void operation(){
        impl.operationImpl();
    }

}
