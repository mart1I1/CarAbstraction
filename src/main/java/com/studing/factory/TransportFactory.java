package com.studing.factory;

import com.studing.builder.TransportBuilder;
import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;
import com.studing.detail.WheelBrand;
import com.studing.transport.ITransport;
import com.studing.transport.Transport;

public class TransportFactory {
    private static TransportFactory instance;

    public static synchronized TransportFactory getInstance() {
        if (instance == null) {
            instance = new TransportFactory();
        }
        return instance;
    }

    public synchronized ITransport getTransport(TransportType type) {
        switch (type) {
            case SPORT_CAR: {
                return getSportCar();
            }
            default: {
                return null;
            }
        }
    }

    private ITransport getSportCar() {
        return new TransportBuilder()
                .setEngine(new Engine(100, 10))
                .setSeat(new Seat(true))
                .setWheel(new Wheel(WheelBrand.GOODYEAR, 40))
                .setTransportName("Sport Car")
                .build();
    }

}
