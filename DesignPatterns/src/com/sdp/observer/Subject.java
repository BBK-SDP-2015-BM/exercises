package com.sdp.observer;

/**
 * Created by Basil on 23/01/2016.
 */
public interface Subject {

    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();

}
