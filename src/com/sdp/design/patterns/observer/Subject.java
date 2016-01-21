package com.sdp.design.patterns.observer;

import java.util.Observable;

/**
 * Created by bmason06 on 21/01/2016.
 */
public class Subject extends Observable {

    private boolean toggle;

    public Subject() {
        this.toggle = true;
    }

    public void toggleToggle() {
        if (this.toggle)
            this.toggle = false;

        setChanged();
        notifyObservers();

    }

}
