package com.studing.transport;

import com.studing.detail.Engine;
import com.studing.detail.Seat;

public abstract class Transport implements ITransport {

    private Engine engine;
    private Seat seat;
    private boolean isMoving;
    protected String transportName;

    public Transport(Engine engine, Seat seat) {
        this.engine = engine;
        this.seat = seat;
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

    protected Boolean isCompleted() {
        return engine != null && seat != null;
    }

}
