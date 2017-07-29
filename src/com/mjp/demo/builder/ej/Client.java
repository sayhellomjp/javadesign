package com.mjp.demo.builder.ej;

/**
 * Created by HAHAHA on 2017/7/26.
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person.Builder("mjp")
                .sex(1)
                .age(10)
                .height(183)
                .weight(140)
                .build();
    }

}
