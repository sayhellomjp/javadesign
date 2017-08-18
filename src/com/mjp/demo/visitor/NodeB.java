package com.mjp.demo.visitor;

/**
 * 具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 */
public class NodeB implements Node {
    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "nodeB";
    }
}
