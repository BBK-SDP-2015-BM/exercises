package com.sdp.factory;

/**
 * Created by Basil on 23/01/2016.
 */
public interface Creator {

    default public Product factory() {
        return new ConcreteProduct();
    }

}
