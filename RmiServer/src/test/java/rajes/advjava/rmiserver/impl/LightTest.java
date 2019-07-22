package rajes.advjava.rmiserver.impl;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LightTest {
    public static void main(String[] args) {

        ArrayList<Light> lights = new ArrayList<>();
        lights.add( new Light("Amber", "20W"));
        lights.add( new Light("DayLight", "40W"));
        lights.add( new Light("Bright White", "60W"));
        lights.add( new Light("Cool White", "15W"));

        System.out.println(lights);


    }

}