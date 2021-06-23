package com.kv.proxy;

/**
 * Created by tanjunzhao on 2021/6/23.
 */
public class Boss {

    public static void main(String[] args) {

       //静态代理
       testProxy();

       //动态代理
       dynamicProxy();

    }

    private static void testProxy(){

        Driver driver = new DriverA();

        DriveProxy driveProxy = new DriveProxy(driver);

        driveProxy.drive();

    }

    private static void dynamicProxy(){

        Driver driver = new DriverB();

        Driver dynamicProxy = (Driver) new DynamicProxy(driver).getProxyInstance();

        dynamicProxy.drive();

    }

}
