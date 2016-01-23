package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class RomaTomatoes extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public RomaTomatoes(Pizza base) {
        this.desc = "Roma Tomatoes";
        this.price = 5.20;
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
