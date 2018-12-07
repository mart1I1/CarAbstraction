package com.studing.transport;

import com.studing.detail.Engine;
import com.studing.detail.Seat;

public class Boat extends Transport {

    public Boat(Engine engine, Seat seat) {
        super(engine, seat);
        this.transportName = "Boat";
    }
}
