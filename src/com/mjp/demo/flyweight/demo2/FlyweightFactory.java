package com.mjp.demo.flyweight.demo2;

import com.mjp.demo.flyweight.demo1.ConcreteFlyweight;
import com.mjp.demo.flyweight.demo1.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> temp = new HashMap<String, Flyweight>();

    /**
     * 复合享元对象的工厂方法
     * @param outStateList
     * @return
     */
    public Flyweight factory(List<String> outStateList){
        ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();

        for(String outState: outStateList){
            compositeFlyweight.add(outState, this.factory(outState));
        }

        return compositeFlyweight;
    }

    /**
     * 单纯享元对象的工厂方法
     * @param inState
     * @return
     */
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
