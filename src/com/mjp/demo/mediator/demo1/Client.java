package com.mjp.demo.mediator.demo1;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        //创建同事类
        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);

        //让中介者知道所有的同事
        mediator.setConcreteColleagueA(colleagueA);
        mediator.setConcreteColleagueB(colleagueB);

        //同事类A变化
        colleagueA.operate();
        System.out.println("------------");

        //同事类B变化
        colleagueB.operate();

    }

}
