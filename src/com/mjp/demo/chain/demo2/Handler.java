package com.mjp.demo.chain.demo2;

/**
 * 抽象的处理类
 */
public abstract class Handler {

    private Handler successor;

    /**
     * 处理金额审批的方法
     * @param money
     */
    public abstract void handleFeeRequest(double money);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
