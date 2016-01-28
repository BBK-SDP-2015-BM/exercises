package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class Ham extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public Ham(Pizza base) {
        this.desc = "Ham";
        this.price = 18.12;
        this.base = base;
    }

    @Override
    public String getDesc() {
        return base.getDesc() + ", " + desc + " (" + price + ")";
    }

    @Override
    public double getPrice() {
        return base.getPrice() + price;
    }
}
