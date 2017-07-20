package com.mjp.demo.abstractfactory;

/**
 * 具体的产品，intel主板
 */
public class IntelMainboard implements Mainboard {
    @Override
    public void showMsg() {
        System.out.println("主板：intel");
    }
}
