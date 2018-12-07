package com.studing.detail;

public class Seat {

    private Boolean isLeather;

    public Seat(Boolean isLeather) {
        this.isLeather = isLeather;
    }

    public Boolean getLeather() {
        return isLeather;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "isLeather=" + isLeather +
                '}';
    }
}
