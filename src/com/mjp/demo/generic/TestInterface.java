package com.mjp.demo.generic;

public interface TestInterface<T> {

    public <U> void test(U u);

    public T getData();

}
