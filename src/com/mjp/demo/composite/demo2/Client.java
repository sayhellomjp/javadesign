package com.mjp.demo.composite.demo2;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //由于是透明式组合模式，所有方法在抽象类中均有定义，所以所有的类型都可以为抽象类
        Component root = new Composite("服装");
        Component boy = new Composite("男装");
        Component girl = new Composite("女装");

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
