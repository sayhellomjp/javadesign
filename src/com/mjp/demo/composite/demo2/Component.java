package com.mjp.demo.composite.demo2;

/**
 * 抽象构建，使用抽象类来实现，子节点和树枝节点共有的方法用抽象方法定义，
 * 树枝节点独有的方法用普通方法实现，并给出缺省实现
 */
public abstract class Component {

    /**
     * 添加子节点
     * @param component
     */
    public void addChild(Component component) {
        /**
         * 缺省实现，抛出异常，因为叶子对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此方法");
    }

    /**
     * 删除子节点
     * @param index
     */
    public void removeChild(int index) {
        /**
         * 缺省实现，抛出异常，因为叶子对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此方法");
    }

    /**
     * 展示节点名称
     */
    public abstract void showName(String parentName);

}
