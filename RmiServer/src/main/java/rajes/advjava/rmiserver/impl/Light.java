package rajes.advjava.rmiserver.impl;

public class Light {
/* rajes created on 7/21/2019 
inside the package - rajes.advjava.rmiserver.impl */
String color;
String wattage;

    public Light(String color, String wattage) {
        this.color = color;
        this.wattage = wattage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Light{" +
                "color='" + color + '\'' +
                ", wattage='" + wattage + '\'' +
                '}';
    }
}
