package com.mjp.demo.factorymethod;

/**
 * Created by HAHAHA on 2017/7/13.
 */
public class Client {

    public static void main(String[] args) {
        //test html factory
        ExportFactory exportFactory = new ExportHtmlFactory();
        Export htmlResult1 = exportFactory.getExport("test1");
        htmlResult1.export();
        Export htmlResult2 = exportFactory.getExport("test2");
        htmlResult2.export();
    }

}
