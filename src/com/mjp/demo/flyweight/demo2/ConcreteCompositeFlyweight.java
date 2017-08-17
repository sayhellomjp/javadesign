package com.mjp.demo.flyweight.demo2;

import com.mjp.demo.flyweight.demo1.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元(ConcreteCompositeFlyweight)角色 ：复合享元角色所代表的对象是不可以共享的，
 * 但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。复合享元角色又称作不可共享的享元对象。
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    //保存单纯享元状态
    private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

    /**
     * 增加一个新的单纯享元对象到聚集中，这里的compositeOutState为复合享元对象的外蕴状态，
     * 且该状态与该对象下的所有单纯对象的外蕴状态是一样的
     * @param compositeOutState
     * @param flyweight
     */
    public void add(String compositeOutState, Flyweight flyweight) {
        files.put(compositeOutState, flyweight);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     * @param compositeOutState
     */
    @Override
    public void operation(String compositeOutState) {
        for(String key: files.keySet()){
            files.get(key).operation(compositeOutState);
        }
    }
}
