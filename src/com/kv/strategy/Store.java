package com.kv.strategy;



/**
 * Created by tanjunzhao on 2021/6/22.
 */
public class Store {

    public static void main(String[] args) {

        Seller seller = new Seller("618");
//        Seller seller = new Seller("1111");
//        Seller seller = new Seller("normal");

        seller.showActivity();

    }

}
