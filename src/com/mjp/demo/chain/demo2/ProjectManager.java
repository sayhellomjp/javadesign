package com.mjp.demo.chain.demo2;

/**
 * 具体的处理类，项目经理
 */
public class ProjectManager extends Handler {
    @Override
    public void handleFeeRequest(double money) {
        if(money > 400){
            System.out.println("金额超过400，项目经理转交请求到下一级");
            if(getSuccessor() != null){
                getSuccessor().handleFeeRequest(money);
            }
        }else{
            System.out.println("金额未超过400，项目经理同意审批");
        }
    }
}
