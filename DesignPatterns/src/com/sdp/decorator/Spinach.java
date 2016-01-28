package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class Spinach extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public Spinach(Pizza base) {
        this.desc = "Spinach";
        this.price = 7.92;
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
