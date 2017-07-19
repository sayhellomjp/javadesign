package com.mjp.demo.builder;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.getResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

}
