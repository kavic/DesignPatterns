package com.kv.strategy;

/**
 * Created by tanjunzhao on 2021/6/22.
 */
public class SaleStrategyC implements SaleStrategy{
    @Override
    public void sell() {
        System.out.println("普通促销活动上线");
    }
}
