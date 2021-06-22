package com.kv.adapter;

/**
 * Created by tanjunzhao on 2021/6/22.
 */

/**
 * 将一个类的接口转成客户期望的另外一个接口。适配器模式使得原本由于接口不匹配而不能一起工作的那些类可以一起工作。
 * 本示例通过使用适配器将laptop的typeC数据传输接口转换为HDMI接口，供monitor使用
 */
public class Monitor {

    public void display(HdmiAdapter adapter){

        adapter.hdmiOutput();

    }

    public static void main(String[] args) {
        LaptopAdapter laptopAdapter = new LaptopAdapter(new Laptop());
        Monitor monitor = new Monitor();
        monitor.display(laptopAdapter);
    }

}
