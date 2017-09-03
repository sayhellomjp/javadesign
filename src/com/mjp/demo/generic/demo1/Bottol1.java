package com.mjp.demo.generic.demo1;

import java.util.ArrayList;
import java.util.List;

public class Bottol1<T1 extends Apple, T2 extends Apple> {

    private T1 t1;
    private T2 t2;

    public Bottol1(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1(){
        return t1;
    }

    public T2 getT2(){
        return t2;
    }

    public <T extends Apple, U extends Apple> void printData(T t, U u){
        System.out.println(t);
        System.out.println(u);

        List<? extends Apple> list1 = new ArrayList<RedApple>();
        List<? extends Apple> list2 = new ArrayList<GreenApple>();

        List<? super GreenApple> list3 = new ArrayList<GreenApple>();
        list3.add(new GreenApple());
    }

}
