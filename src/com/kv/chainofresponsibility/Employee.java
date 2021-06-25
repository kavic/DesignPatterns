package com.kv.chainofresponsibility;

/**
 * Created by tanjunzhao on 2021/6/25.
 */
public class Employee {

    public static void main(String[] args){

        Manager tm = new TeamManager("组长");
        Manager pm = new ProjectManager("项目经理");
        Manager boss = new Boss("老板");

        tm.setSuperior(pm);
        pm.setSuperior(boss);


        tm.handleRequest(2);
        tm.handleRequest(4);
        tm.handleRequest(6);
        tm.handleRequest(8);

        pm.handleRequest(2);
        pm.handleRequest(4);
        pm.handleRequest(6);
        pm.handleRequest(8);

    }

}
