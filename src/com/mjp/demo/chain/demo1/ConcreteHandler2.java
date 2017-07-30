package com.mjp.demo.chain.demo1;

/**
 * 具体的处理者
 */
public class ConcreteHandler2 extends Handler {

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */
        if(getSuccessor() != null){
            System.out.println("Handler2放过请求");
            getSuccessor().handleRequest();
        }else{
            System.out.println("Handler2处理请求");
        }
    }

}
