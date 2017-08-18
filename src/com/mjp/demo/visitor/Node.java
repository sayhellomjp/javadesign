package com.mjp.demo.visitor;

/**
 * 抽象节点(Node)角色：声明一个接受操作，接受一个访问者对象作为一个参数。
 */
public interface Node {

    /**
     * 接受操作，接受一个访问者对象作为一个参数
     * @param visitor
     */
    public void accept(Visitor visitor);

}
