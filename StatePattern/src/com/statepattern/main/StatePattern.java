package com.statepattern.main;

import com.statepattern.concretestate.TrafficLightAmbar;
import com.statepattern.concretestate.TrafficLightGreen;
import com.statepattern.concretestate.TrafficLightRed;
import com.statepattern.context.TrafficLight;
import java.util.Timer;
import java.util.TimerTask;

public class StatePattern {
    public static void main(String[] args){
        Timer timer = new Timer();
        TimerTask showColorByRange = new TimerTask() {
            TrafficLight trafficLight = new TrafficLight();
            int tics=0;
            @Override
            public void run() {
                if(tics%2==0){
                    trafficLight.setStateTL(new TrafficLightAmbar());
                    trafficLight.show();
                    trafficLight.setStateTL(new TrafficLightRed());
                    trafficLight.show();
                    System.out.println("\n");
                } else {
                    trafficLight.setStateTL(new TrafficLightGreen());
                    trafficLight.show();
                    System.out.println("\n");
                }
                tics++;
            }
        };
        timer.schedule(showColorByRange, 1000, 10000);
    }
}
