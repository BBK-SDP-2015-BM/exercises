package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class Meat extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public Meat(Pizza base) {
        this.desc = "Meat";
        this.price = 14.25;
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
