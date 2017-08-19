package com.mjp.demo.iterator;

/**
 * 聚集的接口或抽象类
 */
public interface Aggregate {

    /**
     * 新增
     * @param object
     */
    public void add(Object object);

    /**
     * 得到某一个下标对应元素
     * @param index
     * @return
     */
    public Object get(int index);

    /**
     * 返回聚集长度
     * @return
     */
    public int size();

    /**
     * 得到迭代器
     * @return
     */
    public Iterator iterator();

}
