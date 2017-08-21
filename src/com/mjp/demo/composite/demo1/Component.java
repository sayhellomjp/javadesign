package com.mjp.demo.composite.demo1;

/**
 * 抽象构建，使用接口来定义，只定义出叶子节点和树枝节点共同的方法
 */
public interface Component {

    /**
     * 展示节点名称
     */
    public void showName(String parentName);

}
