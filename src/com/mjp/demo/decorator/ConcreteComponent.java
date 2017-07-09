package com.mjp.demo.decorator;

/**
 * 具体的实现类，装饰类修饰的就是该类
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("doing basic things");
    }
}
