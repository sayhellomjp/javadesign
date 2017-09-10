package com.mjp.demo.enumdemo;

import java.util.Arrays;

public enum Color {

    RED("红色", "red", 1), BLUE("蓝色", "blue", 2), ORANGE("橙色", "orange", 3);

    private String text;
    private String value;
    private int code;

    private Color(String text, String value, int code){
        this.text = text;
        this.value = value;
        this.code = code;
    };

    public static void main(String[] args) {
//        Arrays.copyOf()
    }
}
