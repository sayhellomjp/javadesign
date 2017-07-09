package com.mjp.demo.decorator;

/**
 * 装饰的抽象类，这是一个特殊的代理类（代理模式），具体执行的方法还是由传入进来的ConcreteComponent(具体实现类)决定，注意，该类必持有一个最核心Component的引用
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void operate(){
        component.operate();
    }

}
