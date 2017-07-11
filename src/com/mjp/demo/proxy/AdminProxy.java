package com.mjp.demo.proxy;

/**
 * Created by HAHAHA on 2017/7/11.
 */
public class AdminProxy implements IAdmin {
    private Admin admin;

    public AdminProxy(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void operate() {
        System.out.println("before");
        admin.operate();
        System.out.println("after");
    }
}
