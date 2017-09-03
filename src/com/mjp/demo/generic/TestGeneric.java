package com.mjp.demo.generic;

public class TestGeneric<T, U> {

    private T data1;

    private U data2;

    public TestGeneric(){}

    public TestGeneric(T data1, U data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public U getData2() {
        return data2;
    }

    public void setData2(U data2) {
        this.data2 = data2;
    }
}
