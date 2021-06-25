package com.kv.chainofresponsibility;

/**
 * Created by tanjunzhao on 2021/6/25.
 */
public class ProjectManager extends Manager {

    public ProjectManager(String title) {
        super(title);
    }

    @Override
    public void handleRequest(int days) {
        if (days <= 7) {
            System.out.println("项目经理审批通过。\n");
        } else {
            System.out.println("项目经理权力不够，提交上级处理。");
            superior.handleRequest(days);
        }
    }
}
