package com.mjp.demo.annotation;

import java.lang.reflect.Field;

public class Client {

    @FruitName("苹果")
    private String appleName;

    @FruitColor(color = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 123, name = "峨眉水泥厂", address = "南北干道123号")
    private Object appleProvider;

    public static void explainFruit(Class clazz){
        Field[] fields = clazz.getDeclaredFields();
        for (Field f: fields){
            if(f.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = f.getAnnotation(FruitName.class);
                System.out.println(fruitName.value());
            }
            if(f.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = f.getAnnotation(FruitColor.class);
                System.out.println(fruitColor.color().getText());
            }
            if(f.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = f.getAnnotation(FruitProvider.class);
                System.out.println(fruitProvider.id() + " " + fruitProvider.name() + " " + fruitProvider.address());
            }
        }
    }

    public static void main(String[] args) {

//        Client.explainFruit(Client.class);

        String a = "13";
        String b = a;
        System.out.println(a);
        System.out.println(b);

        a = "555";
        System.out.println(a);
        System.out.println(b);

    }

}
