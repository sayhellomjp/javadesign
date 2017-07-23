package com.mjp.demo.single;

/**
 * 饿汉单例模式
 */
public class EagerSingleton {

    //实例化一个静态对象
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    //将构造方法私有化，防止通过new创建实例
    private EagerSingleton(){};

    //静态的获取实例的方法供外部调用
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

}
