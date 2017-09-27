package com.mjp.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList，模仿ArrayList类的底层结构！
 */
public class MyArrayList{

    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                if (initialCapacity < 0)
                    throw new IllegalArgumentException("错错错，容量不能小于0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 初始化数组
        elementData = new Object[initialCapacity];
    }

    public void add(Object obj) {
        // 数组扩容和数据的拷贝
        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            // 数组拷贝
            // arraycopy(Object src, int srcPos, Object dest, int destPos, int
            // length)
            // System.arraycopy(elementData, 0, newArray, 0,
            // elementData.length);
            for (int i = 0; i < elementData.length; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }

        elementData[size++] = obj;
    }

    public void add(int index, Object obj) {
        rangeCheck(index);
        ensureCapacity(); // 数组扩容
        System.arraycopy(elementData, index, elementData, index + 1, size
                - index);
        elementData[index] = obj;
        size++;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public void remove(int index) {
        rangeCheck(index);
        // 删除指定位置的对象
        // a b d e
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        }
        elementData[--size] = null; // Let gc do its work
    }

    public void remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(obj)) { // 注意：底层调用的equals方法而不是==.
                remove(i);
            }
        }
    }

    public Object set(int index, Object obj) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    private void ensureCapacity() {
        // 数组扩容和数据的拷贝
        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            // for(int i=0;i<elementData.length;i++){
            // newArray[i] = elementData[i];
            // }
            elementData = newArray;
        }
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new IndexOutOfBoundsException("数组下标越界啦！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("333");
        list.add("444");
        list.add("5");
        list.add("344433");
        list.add("333");
        list.add("333");
        System.out.println(list.size());
        list.remove("444");
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}