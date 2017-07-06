package com.mjp.demo.simplefactory;

/**
 * Created by HAHAHA on 2017/3/30.
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        if ("+".equals(operate)) {
            operation = new AddOperation();
        } else if ("-".equals(operate)) {
            operation = new SubOperation();
        }
        return operation;
    }

}
