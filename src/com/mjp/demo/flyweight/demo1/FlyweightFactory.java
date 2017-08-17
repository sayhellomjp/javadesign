package com.mjp.demo.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> temp = new HashMap<String, Flyweight>();

    public Flyweight factory(String inState){
        //先从缓存中查找对象
        Flyweight flyweight = temp.get(inState);

        if(null == flyweight){
            //如果对象不存在则创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(inState);
            //将对象加入缓存中
            temp.put(inState, flyweight);
        }

        return flyweight;
    }

}
