package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class SimplyVegPizza implements Pizza {

    private String desc;
    private double price;

    public SimplyVegPizza() {
        this.desc = "Simply Veg Pizza";
        this.price = 230;
    }

    @Override
    public String getDesc() {
        return desc + " (" + price + ")";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
