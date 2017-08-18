package com.mjp.demo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色类，这个结构对象角色持有一个聚集，并向外界提供add()方法作为对聚集的管理操作。
 * 通过调用这个方法，可以动态地增加一个新的节点。
 */
public class ObjectStructure {

    private List<Node> nodes = new ArrayList<Node>();

    /**
     * 执行方法操作
     * @param visitor
     */
    public void action(Visitor visitor){
        for(Node node: nodes){
            //根据node真实类型和visitor真实类型判断调用的方法
            node.accept(visitor);
        }
    }

    /**
     * 添加节点
     * @param node
     */
    public void add(Node node) {
        nodes.add(node);
    }

}
