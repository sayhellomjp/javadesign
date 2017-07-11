package com.mjp.demo.proxy;

/**
 * Created by HAHAHA on 2017/7/11.
 */
public class Admin implements IAdmin {

    @Override
    public void operate() {
        System.out.println("admin doing");
    }
}
