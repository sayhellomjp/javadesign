package com.mjp.demo.visitor;

/**
 * 具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 */
public class NodeA implements Node {
    /**
     * 接受操作，接收一个访问者对象，同时调用访问者对象的visit方法，把自己作为参数传过去
     */
    @Override
    public void accept(Visitor visitor) {
        //这里为方法重载，执行时判断this的真实类型，判断调用visitor对象的哪个方法
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "nodeA";
    }
}
