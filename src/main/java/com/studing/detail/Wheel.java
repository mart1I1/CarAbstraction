package com.studing.detail;

public class Wheel {

    private WheelBrand brand;
    private Integer diameter;

    public Wheel(WheelBrand brand, Integer diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    public WheelBrand getBrand() {
        return brand;
    }

    public Integer getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
