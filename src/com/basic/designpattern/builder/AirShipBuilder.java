package com.basic.designpattern.builder;

public interface AirShipBuilder {

    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
