package com.kv.proxy;

/**
 * Created by tanjunzhao on 2021/6/23.
 */
public class DriverA implements Driver {
    @Override
    public void drive() {
        System.out.println("A司机代驾");
    }
}
