package com.statepattern.context;

import com.statepattern.concretestate.TrafficLightGreen;
import com.statepattern.state.TrafficLightState;

public class TrafficLight implements TrafficLightState{
    private TrafficLightState stateTL;

    public TrafficLight() {
        this.stateTL = new TrafficLightGreen();
    }

    public TrafficLightState getStateTL() {
        return stateTL;
    }

    public void setStateTL(TrafficLightState stateTL) {
        this.stateTL = stateTL;
    }
    
    @Override
    public void show(){
        this.stateTL.show();
    }
}
