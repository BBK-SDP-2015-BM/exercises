package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class Cheese extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public Cheese(Pizza base) {
        this.desc = "Cheese";
        this.price = 20.72;
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
