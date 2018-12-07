package com.studing.transport;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;

public class SportCar extends Transport {

    private Wheel wheel;

    public SportCar(Engine engine, Seat seat, Wheel wheel) {
        super(engine, seat);
        this.wheel = wheel;
        this.transportName = "Sport car!";
    }

    @Override
    public String toString() {
        return isCompleted()? "SportCar{" +
                "engine=" + this.getEngine() +
                ", seat=" + this.getSeat() +
                ", wheel=" + wheel.toString() +
                '}' : "SportCar{Not Completed!}";
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
