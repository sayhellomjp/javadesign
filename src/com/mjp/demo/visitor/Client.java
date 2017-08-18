package com.mjp.demo.visitor;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());

        objectStructure.action(new VisitorA());
        System.out.println("----------------");
        objectStructure.action(new VisitorB());
    }

}
