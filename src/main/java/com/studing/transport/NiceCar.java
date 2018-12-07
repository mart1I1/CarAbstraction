package com.studing.transport;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;
import com.studing.detail.WheelBrand;

public class NiceCar extends Transport {

    private Wheel wheel;

    public NiceCar() {
        super(new Engine(79, 8), new Seat(false));
        this.transportName = "Nice car";
        wheel = new Wheel(WheelBrand.MICHELIN, 38);
    }

    @Override
    public String toString() {
        return "NiceCar{" +
                "engine=" + this.getEngine() +
                ", seat=" + this.getSeat() +
                ", wheel=" + wheel.toString() +
                '}';
    }

    public void move() {
        super.move();
    }

    public void stop() {
        super.stop();
    }

    @Override
    protected Boolean isCompleted() {
        return super.isCompleted() && wheel != null;
    }
}
