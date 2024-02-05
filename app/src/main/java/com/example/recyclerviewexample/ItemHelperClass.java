package com.example.recyclerviewexample;


public class ItemHelperClass {
    String itemName, itemPrice, itemDesc;
    int itemImage;


    public ItemHelperClass(String itemName, String itemPrice, String itemDesc, int itemImage) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDesc = itemDesc;
        this.itemImage = itemImage;
    }


    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public int getItemImage() {
        return itemImage;
    }
}
