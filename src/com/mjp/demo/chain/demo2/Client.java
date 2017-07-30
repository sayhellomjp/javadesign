package com.mjp.demo.chain.demo2;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Handler project = new ProjectManager();
        Handler dept = new DeptManager();
        Handler company = new CompanyManager();

        project.setSuccessor(dept);
        dept.setSuccessor(company);

        //最先由项目经理审批
        project.handleFeeRequest(100);
        System.out.println("--------------------");
        project.handleFeeRequest(500);
        System.out.println("--------------------");
        project.handleFeeRequest(2000);
        System.out.println("--------------------");
    }

}
