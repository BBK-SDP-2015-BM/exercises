package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class SimplyNonVegPizza implements Pizza {

    private String desc;
    private double price;

    public SimplyNonVegPizza() {
        this.desc = "Simply Non-Veg Pizza";
        this.price = 350;
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
