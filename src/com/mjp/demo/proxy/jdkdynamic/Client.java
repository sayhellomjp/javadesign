package com.mjp.demo.proxy.jdkdynamic;

/**
 * Created by HAHAHA on 2017/7/12.
 */
public class Client {

    public static void main(String[] args) {
        RealObjectInterface realObjectInterface = new RealObject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realObjectInterface);
        RealObjectInterface p = (RealObjectInterface) myInvocationHandler.getProxy();
        p.operate();
    }

}
