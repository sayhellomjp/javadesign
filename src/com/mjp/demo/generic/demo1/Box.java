package com.mjp.demo.generic.demo1;

public class Box<T> {

    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getData() {
        return this.t;
    }

    public static void test(Box<?> box) {
        System.out.println(box.getData());
    }

    public static void test2(Box<? extends Number> box) {
        System.out.println(box.getData());
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("lalala");
        Box.test(box1);

        Box<Integer> box2 = new Box<Integer>(90);
        Box.test(box2);

        Box.test2(new Box<Integer>(4));
//        Box.test2(new Box<String>(4));
    }

}
