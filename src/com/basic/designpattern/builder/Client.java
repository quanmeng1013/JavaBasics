package com.basic.designpattern.builder;

public class Client {

    public static void main(String[] args) {

        AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());

        AirShip airShip = director.directorAirShip();

        System.out.println(airShip.getEngine().getName());
    }
}
