package com.mjp.demo.simplefactory;

/**
 * Created by HAHAHA on 2017/3/30.
 */
public class TestMain {

    public static void main(String[] args) {

        Operation addOperation = OperationFactory.createOperate("+");
        addOperation.setNumberA(5);
        addOperation.setNumberB(3);
        System.out.println(addOperation.getResult());

        Operation subOperation = OperationFactory.createOperate("-");
        subOperation.setNumberA(5);
        subOperation.setNumberB(3);
        System.out.println(subOperation.getResult());
    }
}
