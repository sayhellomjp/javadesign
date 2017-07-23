package com.mjp.demo.adapter.demo2;

/**
 * Created by hahaha on 2017/7/23.
 */
public class Client {

    public static void main(String[] args) {

        //通过构造方法传入适配对象
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();

    }

}
