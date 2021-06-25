package com.kv.chainofresponsibility;

/**
 * Created by tanjunzhao on 2021/6/25.
 */
public class TeamManager extends Manager {

    public TeamManager(String title) {
        super(title);
    }

    @Override
    public void handleRequest(int days) {

        if (days <= 2) {
            System.out.println("组长审批通过。\n");
        } else {
            System.out.println("组长权力不够，提交上级处理。");
            superior.handleRequest(days);
        }

    }
}
