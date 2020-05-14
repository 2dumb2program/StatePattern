package com.statepattern.concretestate;

import com.statepattern.state.TrafficLightState;

public class TrafficLightRed implements TrafficLightState{
    @Override
    public void show() {
        System.out.println("Luz roja: Alto");
    }
}
