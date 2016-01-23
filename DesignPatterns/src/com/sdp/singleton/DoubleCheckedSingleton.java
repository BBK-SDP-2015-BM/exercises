package com.sdp.singleton;

/**
 * Created by Basil on 23/01/2016.
 */
public class DoubleCheckedSingleton {

    // instance variable
    private static DoubleCheckedSingleton instance;

    // lock
    private static Object lock = new Object();

    // private constructor
    private DoubleCheckedSingleton() {}

    // public instance getter
    public synchronized static DoubleCheckedSingleton getInstance() {

        // lazy instantiation
        if (instance == null) {

            synchronized (lock) {
                instance = new DoubleCheckedSingleton();
            }

        }

        return instance;
    }

}
