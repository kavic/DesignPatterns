package com.kv.strategy;

/**
 * Created by tanjunzhao on 2021/6/22.
 */
public class Seller {

    private SaleStrategy saleStrategy;

    public Seller(String date){
        switch (date){

            case "618":
                saleStrategy = new SaleStrategyA();
                break;
            case "1111":
                saleStrategy = new SaleStrategyB();
                break;
            case "normal":
                saleStrategy = new SaleStrategyC();
                break;

        }
    }

    public void showActivity(){
        saleStrategy.sell();
    }

}
