package com.sdp.design.patterns.observer;

import java.util.Observer;

/**
 * Created by bmason06 on 21/01/2016.
 */
public class ObserverApp {

    public static void main(String[] args) {

        Observer observer = new Watcher();
        Subject observable = new Subject();
        observable.addObserver(observer);
        observable.toggleToggle();
        observable.toggleToggle();

    }
}
