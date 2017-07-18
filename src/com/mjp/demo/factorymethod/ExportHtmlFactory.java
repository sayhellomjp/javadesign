package com.mjp.demo.factorymethod;

/**
 * Created by HAHAHA on 2017/7/13.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public Export getExport(String type) {
        if("test1".equals(type)){
            return new ExportHtmlTest1();
        }else if("test2".equals(type)){
            return new ExportHtmlTest2();
        }else{
            throw new RuntimeException("未找到匹配的类型");
        }
    }
}
