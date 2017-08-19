package com.mjp.demo.iterator;

/**
 * 具体的聚集类，待遍历的对象
 */
public class ConcreteAggregate implements Aggregate {

    //存放数据的数组，默认100长度
    private Object[] data;
    //下标
    private int index;
    //存放有数据的长度
    private int size;

    public ConcreteAggregate(){
        data = new Object[5];
        index = 0;
        size = 0;
    }

    @Override
    public void add(Object object) {
        if(index >= 5){
            throw new ArrayIndexOutOfBoundsException("超出最大长度限制5");
        }
        data[index] = object;
        index++;
        size++;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
