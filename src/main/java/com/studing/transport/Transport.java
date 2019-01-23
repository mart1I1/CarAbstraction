package com.studing.transport;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;

public class Transport implements ITransport, Cloneable {

    private Engine engine;
    private Seat seat;
    private Wheel wheel;
    private boolean isMoving;
    private String transportName;

    public Transport(Engine engine, Seat seat, Wheel wheel, String transportName) {
        this.engine = engine;
        this.seat = seat;
        this.wheel = wheel;
        this.transportName = transportName;
    }

    public Transport(Transport transport) {
        this.transportName = transport.transportName;
        this.wheel = transport.wheel;
        this.isMoving = transport.isMoving;
        this.engine = transport.engine;
        this.seat = transport.seat;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Seat getSeat() {
        return seat;
    }

    public Boolean getMoving() {
        return isMoving;
    }

    public String getTransportName() {
        return transportName;
    }

    public void move() {
        if (isCompleted()) {
            System.out.println("Move " + transportName);
            isMoving = true;
        } else {
            System.out.println("Something wrong!");
        }
    }

    public void stop() {
        if (isMoving) {
            System.out.println("Stop " + transportName);
            isMoving = false;
        } else {
            System.out.println("Already stopped!");
        }
    }

    public ITransport clone() {
        return new Transport(this);
    }

    private Boolean isCompleted() {
        return engine != null && seat != null && wheel != null;
    }

}
