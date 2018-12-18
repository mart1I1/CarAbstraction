package com.studing;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;
import com.studing.detail.WheelBrand;
import com.studing.factory.TransportFactory;
import com.studing.factory.TransportType;
import com.studing.transport.ITransport;

public class Main {

    public static void main(String[] args) {
        TransportFactory.getInstance().getTransport(TransportType.SPORT_CAR).move();
    }

}
