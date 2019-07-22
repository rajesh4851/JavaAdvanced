package rajes.advjava.rmiserver.impl;

public class Light implements Comparable<Light> {
    /* rajes created on 7/21/2019
    inside the package - rajes.advjava.rmiserver.impl */
    String color;
    int wattage;

    public Light(String color, int wattage) {
        this.color = color;
        this.wattage = wattage;
    }

    @Override
    public int compareTo(Light o) {
        if (this.wattage < o.wattage) {
            return -1;
        } else {
            return 0;
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return
                "color=" + color +
                        " wattage=" + wattage;
    }
}
