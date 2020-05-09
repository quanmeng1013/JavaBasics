package com.basic.designpattern.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        Car c1 = new AoDiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }
}
