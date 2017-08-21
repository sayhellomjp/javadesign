package com.mjp.demo.composite.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        //树枝节点必须指明对象为Composite，而不能是接口对象，因为接口对象没有方法操作子节点
        Composite root = new Composite("服装");
        Composite boy = new Composite("男装");
        Composite girl = new Composite("女装");

        Component boy1 = new Leaf("短袖");
        Component boy2 = new Leaf("沙滩裤");

        Component girl1 = new Leaf("胸罩");
        Component girl2 = new Leaf("内裤");

        boy.addChild(boy1);
        boy.addChild(boy2);

        girl.addChild(girl1);
        girl.addChild(girl2);

        root.addChild(boy);
        root.addChild(girl);

        root.showName("");
    }

}
