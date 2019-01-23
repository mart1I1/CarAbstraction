package com.studing;

import com.studing.factory.TransportFactory;
import com.studing.factory.TransportType;

public class Main {

    public static void main(String[] args) {
        TransportFactory.getInstance().getTransport(TransportType.SPORT_CAR).move();

    }

}
