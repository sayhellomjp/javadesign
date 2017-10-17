package com.mjp.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {

    public enum Color {
        BLUE("蓝色"), RED("红色"), YELLOW("黄色");

        private String text;

        private Color(String text){
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    Color color() default Color.RED;

}
