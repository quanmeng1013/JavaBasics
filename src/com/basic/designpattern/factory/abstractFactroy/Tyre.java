package com.basic.designpattern.factory.abstractFactroy;

public interface Tyre {

    void reolve();
}

class  LuxuryTyre implements Tyre {

    @Override
    public void reolve() {
        System.out.println("旋转不磨损");
    }
}

class  LowTyre implements Tyre {

    @Override
    public void reolve() {
        System.out.println("磨损快");
    }
}