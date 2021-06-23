package com.kv.proxy;

/**
 * Created by tanjunzhao on 2021/6/23.
 */
public class DriveProxy implements Driver {

    private Driver driver;

    public DriveProxy(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        driver.drive();
    }
}
