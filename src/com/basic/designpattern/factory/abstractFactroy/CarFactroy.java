package com.basic.designpattern.factory.abstractFactroy;

public interface CarFactroy {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

