package com.practice.FacadePattern;

public class ShopKepper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop onePlus;
    public ShopKepper(){
       iphone=new Iphone();
       samsung=new Samsung();
       onePlus=new OnePlus();
    }

    public void iphoneSale(){
        iphone.printModelName();
        iphone.printPrice();
    }

    public void samsungSale(){
        samsung.printModelName();
        samsung.printPrice();
    }

    public void onePlusSale(){
        onePlus.printModelName();
        onePlus.printPrice();
    }
}
