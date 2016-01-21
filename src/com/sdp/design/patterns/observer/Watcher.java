package com.sdp.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by bmason06 on 21/01/2016.
 */
public class Watcher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subject changed");
    }
}
