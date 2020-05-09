package com.basic.designpattern.factory.abstractFactroy;

public class Client {

    public static void main(String[] args) {
        CarFactroy factroy = new LuxuryCarFactory();
        Engine e = factroy.createEngine();
        e.run();
        e.start();
    }
}
