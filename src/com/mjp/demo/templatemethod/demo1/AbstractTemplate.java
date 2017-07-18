package com.mjp.demo.templatemethod.demo1;

/**
 * 抽象模版
 */
public abstract class AbstractTemplate {

    /**
     * 模版方法
     */
    public final void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    /**
     * 抽象方法 一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示。
     */
    protected abstract void abstractMethod();

    /**
     * 钩子方法 一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
     */
    protected void hookMethod(){

    }

    /**
     * 具体方法 一个具体方法由抽象类声明并实现，而子类并不实现或置换。
     */
    protected final void concreteMethod(){
        System.out.println("this is a concreteMethod");
    }
}
