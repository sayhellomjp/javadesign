package com.mjp.demo.composite.demo2;


/**
 * 叶子节点
 */
public class Leaf extends Component {

    //节点名称
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void showName(String parentName) {
        System.out.println(parentName + "-" + name);
    }

}
