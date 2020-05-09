package com.basic.designpattern.builder;

public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SxtAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine ee = builder.builderEngine();
        EscapeTower et = builder.builderEscapeTower();
        OrbitalModule oe = builder.builderOrbitalModule();
        AirShip ship = new AirShip();
        ship.setEngine(ee);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(oe);
        return ship;
    }
}
