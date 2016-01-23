package com.sdp.observer;

/**
 * Created by Basil on 23/01/2016.
 */
public class SMSUsers implements Observer {

    Subject subject;
    String commentator;

    public SMSUsers(Subject subject, String commentator) {
        this.subject = subject;
        this.commentator = commentator;
    }

    @Override
    public void update(String desc) {
        System.out.println(desc);
    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);
    }
}
