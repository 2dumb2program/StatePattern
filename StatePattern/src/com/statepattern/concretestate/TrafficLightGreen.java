package com.statepattern.concretestate;

import com.statepattern.state.TrafficLightState;

public class TrafficLightGreen implements TrafficLightState{
    @Override
    public void show() {
        System.out.println("Luz verde: avanza");
    }
}
