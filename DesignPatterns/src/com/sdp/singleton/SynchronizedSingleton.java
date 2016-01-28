package com.sdp.singleton;

/**
 * Created by Basil on 23/01/2016.
 */
public class SynchronizedSingleton {

    // instance variable
    private static SynchronizedSingleton instance;

    // private constructor
    private SynchronizedSingleton() {}

    // public instance getter
    public synchronized static SynchronizedSingleton getInstance() {

        // lazy instantiation
        if (instance == null)
            instance = new SynchronizedSingleton();

        return instance;
    }

}
