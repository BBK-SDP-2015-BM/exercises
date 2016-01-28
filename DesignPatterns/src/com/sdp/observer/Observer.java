package com.sdp.observer;

/**
 * Created by Basil on 23/01/2016.
 */
public interface Observer {

    void update(String desc);
    void subscribe();
    void unSubscribe();

}
