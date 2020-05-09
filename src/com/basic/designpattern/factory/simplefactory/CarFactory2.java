package com.basic.designpattern.factory.simplefactory;

public class CarFactory2 {

    public static Car createAoDi() {
        return new AoDi();
    }
    public static Car createByd() {
        return new Byd();
    }
}
