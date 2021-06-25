package com.kv.chainofresponsibility;

/**
 * Created by tanjunzhao on 2021/6/25.
 */
public class Boss extends Manager {

    public Boss(String title) {
        super(title);
    }

    @Override
    public void handleRequest(int days) {
        System.out.println("老板审批通过。\n");
    }
}
