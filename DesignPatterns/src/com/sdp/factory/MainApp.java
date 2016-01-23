package com.sdp.factory;

/**
 * Created by Basil on 23/01/2016.
 */
public class MainApp {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        Product someProduct = creator.factory();

    }

}
