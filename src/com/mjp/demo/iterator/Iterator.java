package com.mjp.demo.iterator;

/**
 * 定义遍历元素所需要的方法，一般来说会有这么三个方法：取得下一个元素的方法next()，判断是否遍历结束的方法hasNext()），移出当前对象的方法remove()
 */
public interface Iterator {

    /**
     * 是否还有下一级元素
     * @return
     */
    public boolean hasNext();

    /**
     * 获得当前元素
     * @return
     */
    public Object next();

}
