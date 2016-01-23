package com.sdp.singleton;

/**
 * Created by Basil on 23/01/2016.
 */
public class LazySingleton {

    // instance variable
    private static LazySingleton instance;

    // private constructor
    private LazySingleton() {}

    // public instance getter
    public static LazySingleton getInstance() {

        // lazy instantiation
        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }

}
