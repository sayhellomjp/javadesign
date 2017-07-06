package com.mjp.demo.simplefactory;

/**
 * Created by HAHAHA on 2017/3/30.
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
