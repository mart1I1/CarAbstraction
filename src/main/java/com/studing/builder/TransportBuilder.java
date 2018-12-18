package com.studing.builder;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;
import com.studing.transport.Transport;

public class TransportBuilder {
    private Engine engine;
    private Seat seat;
    private Wheel wheel;
    private String transportName;

    public TransportBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public TransportBuilder setSeat(Seat seat) {
        this.seat = seat;
        return this;
    }

    public TransportBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public TransportBuilder setTransportName(String transportName) {
        this.transportName = transportName;
        return this;
    }

    public Transport build() {
        return new Transport(engine, seat, wheel, transportName);
    }
}
