package com.mjp.demo.iterator;

/**
 * 具体迭代器，实现了Iterator接口
 */
public class ConcreteIterator implements Iterator {

    /**
     * 要遍历的聚集
     */
    private Aggregate aggregate = null;

    /**
     * 下标
     */
    private int index = 0;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index >= aggregate.size() ? false : true;
    }

    @Override
    public Object next() {
        Object obj = aggregate.get(index);
        index++;
        return obj;
    }
}
