package com.kv.chainofresponsibility;

/**
 * Created by tanjunzhao on 2021/6/25.
 */
public abstract class Manager {

    protected String title;
    protected Manager superior;

    public Manager(String title) {
        this.title = title;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void handleRequest(int days);

}
