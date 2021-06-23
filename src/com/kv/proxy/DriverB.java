package com.kv.proxy;

/**
 * Created by tanjunzhao on 2021/6/23.
 */
public class DriverB implements Driver {

    @Override
    public void drive() {
        System.out.println("B司机代驾");
    }
}
