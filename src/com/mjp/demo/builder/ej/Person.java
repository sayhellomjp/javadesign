package com.mjp.demo.builder.ej;

/**
 * Created by HAHAHA on 2017/7/26.
 */
public class Person {

    private String name;
    private int age;
    private int sex;
    private double height;
    private double weight;

    private Person(Builder b){
        this.name = b.name;
        this.age = b.age;
        this.sex = b.sex;
        this.height = b.height;
        this.weight = b.weight;
    }

    public static class Builder {
        private String name;
        private int age;
        private int sex;
        private double height;
        private double weight;

        public Builder(String name){
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder sex(int sex) {
            this.sex = sex;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
