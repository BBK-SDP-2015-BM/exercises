package com.sdp.factory;

/**
 * Created by Basil on 23/01/2016.
 */
public class ConcreteCreator implements Creator {

    @Override
    public Product factory() {
        return new ConcreteProduct();
    }

}
