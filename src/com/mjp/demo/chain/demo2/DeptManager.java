package com.mjp.demo.chain.demo2;

/**
 * 具体的处理类，部门经理
 */
public class DeptManager extends Handler {
    @Override
    public void handleFeeRequest(double money) {
        if(money > 1000){
            System.out.println("金额超过1000，部门经理转交请求到下一级");
            if(getSuccessor() != null){
                getSuccessor().handleFeeRequest(money);
            }
        }else{
            System.out.println("金额未超过1000，部门经理同意审批");
        }
    }
}
