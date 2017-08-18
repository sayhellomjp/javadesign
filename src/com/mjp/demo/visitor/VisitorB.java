package com.mjp.demo.visitor;

/**
 * 具体访问者类
 */
public class VisitorB implements Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
