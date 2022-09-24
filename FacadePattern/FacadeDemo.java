package com.practice.FacadePattern;

public class FacadeDemo {
    public static void main(String[] args) {
        ShopKepper shopKepper=new ShopKepper();
        shopKepper.samsungSale();
        shopKepper.iphoneSale();
        shopKepper.onePlusSale();
    }
}
