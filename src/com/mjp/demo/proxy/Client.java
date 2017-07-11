package com.mjp.demo.proxy;

/**
 * Created by HAHAHA on 2017/7/11.
 */
public class Client {

    public static void main(String[] args) {
        Admin admin = new Admin();
        AdminProxy proxy = new AdminProxy(admin);
        proxy.operate();
    }

}
