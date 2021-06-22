package com.kv.strategy;

/**
 * Created by tanjunzhao on 2021/6/22.
 */
public class SaleStrategyA implements SaleStrategy {
    @Override
    public void sell() {
        System.out.println("618促销活动上线");
    }
}
