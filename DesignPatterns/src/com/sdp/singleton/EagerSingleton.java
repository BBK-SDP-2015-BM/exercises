package com.sdp.singleton;

/**
 * Created by Basil on 23/01/2016.
 */
public class EagerSingleton {

    // eagerly instantiate instance variable
    private static EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {}

    // public instance getter
    public static EagerSingleton getInstance() {
        return instance;
    }

}
