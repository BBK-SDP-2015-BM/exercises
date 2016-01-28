package com.sdp.observer;

import java.util.List;

/**
 * Created by Basil on 23/01/2016.
 */
public class CommentaryObject implements Subject, Commentary {

    private String description, subject;
    private List<Observer> observers;

    public CommentaryObject(List<Observer> observers, String subject) {
        this.observers = observers;
        this.subject = subject;
        this.description = "No commentary yet...";
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(description));
    }

    @Override
    public String subjectDetails() {
        return subject;
    }

    @Override
    public void setDesc(String desc) {
        description = desc;
        notifyObservers();
    }
}
