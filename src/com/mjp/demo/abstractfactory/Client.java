package com.mjp.demo.abstractfactory;

import sun.applet.Main;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //amd工厂，若要生产intel的产品，只需在new 工厂时改为 new intelFactory即可
        AbstractFactory factory = new AmdFactory();
        Cpu cpu = factory.createCpu();
        Mainboard mainboard = factory.createMainboard();
        cpu.showMsg();
        mainboard.showMsg();
    }

}
