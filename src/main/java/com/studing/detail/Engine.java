package com.studing.detail;

public class Engine {

    private Integer power;
    private Integer fuelConsumption;

    public Engine(Integer power, Integer fuelConsumption) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
