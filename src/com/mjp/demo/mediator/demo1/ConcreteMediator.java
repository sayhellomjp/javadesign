package com.mjp.demo.mediator.demo1;

/**
 * 具体的中介者
 */
public class ConcreteMediator implements Mediator {

    //中介者需要知道所有的具体的同事类
    private Colleague concreteColleagueA;
    private Colleague concreteColleagueB;

    public void setConcreteColleagueA(Colleague concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(Colleague concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    /**
     * 当某一个同事类发生变化，需要通知其他的同事类来实现协助行为
     * @param colleague
     */
    @Override
    public void change(Colleague colleague) {
        if(colleague == concreteColleagueA){
            System.out.println("同事类A发生了变化，需要B协助");
            concreteColleagueB.doHelp();

        }else if(colleague == concreteColleagueB){
            System.out.println("同事类B发生了变化，需要A协助");
            concreteColleagueA.doHelp();
        }
    }
}
