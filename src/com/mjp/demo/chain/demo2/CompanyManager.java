package com.mjp.demo.chain.demo2;

/**
 * 具体的处理类，公司经理
 */
public class CompanyManager extends Handler {
    @Override
    public void handleFeeRequest(double money) {
        System.out.println("公司老总处理");
    }
}
