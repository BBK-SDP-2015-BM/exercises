package com.sdp.design.patterns.singleton;

/**
 * Created by bmason06 on 21/01/2016.
 */
public class Singleton {

    // private member variable
    private static Singleton instance;

    // private constructor
    private Singleton() {}

    // public getter
    public synchronized static Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();

        return instance;
    }

}
