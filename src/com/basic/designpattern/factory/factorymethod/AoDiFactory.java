package com.basic.designpattern.factory.factorymethod;

public class AoDiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AoDi();
    }
}
