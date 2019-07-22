package rajes.advjava.rmiserver.impl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class LightTest {
    public static void main(String[] args) {

        ArrayList<Light> lights = new ArrayList<Light>();
        lights.add( new Light("Amber", 40));
        lights.add( new Light("DayLight", 60));
        lights.add( new Light("Bright White", 35));
        lights.add( new Light("Cool White", 20));


        System.out.println("before sorting on wattage "+lights);

        //sort list of objects based on their property
        Collections.sort(lights);
        System.out.println("after sorting on wattage :"+lights);

    }

}