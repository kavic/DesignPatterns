package com.kv.adapter;

/**
 * Created by tanjunzhao on 2021/6/22.
 */
public class LaptopAdapter implements HdmiAdapter{

    private Laptop laptop;

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    }

    @Override
    public void hdmiOutput() {

        laptop.typeCOutput();

        System.out.println("将typeC数据转换为Hdmi数据输出...");

    }
}
