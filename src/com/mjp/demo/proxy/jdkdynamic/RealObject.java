package com.mjp.demo.proxy.jdkdynamic;

/**
 * Created by HAHAHA on 2017/7/12.
 */
public class RealObject implements RealObjectInterface {
    @Override
    public void operate() {
        System.out.println("doing something");
    }
}
