package com.sdp.decorator;

/**
 * Created by Basil on 23/01/2016.
 */
public class GreenOlives extends PizzaDecorator {

    private Pizza base;
    private double price;
    private String desc;

    public GreenOlives(Pizza base) {
        this.desc = "Green Olives";
        this.price = 5.47;
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
