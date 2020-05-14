package com.statepattern.concretestate;

import com.statepattern.state.TrafficLightState;

public class TrafficLightAmbar implements TrafficLightState{
    @Override
    public void show() {
        System.out.println("Luz ambar: Preparese para detenerse");
    }
}
