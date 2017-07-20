package com.mjp.demo.abstractfactory;

/**
 * 具体的产品，amd主板
 */
public class AmdMainboard implements Mainboard {
    @Override
    public void showMsg() {
        System.out.println("主板：amd");
    }
}
