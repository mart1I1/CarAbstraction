package com.studing;

import com.studing.factory.TransportFactory;
import com.studing.factory.TransportType;
import com.studing.transport.ITransport;

public class Main {

    public static void main(String[] args) {
        ITransport sportCar = TransportFactory.getInstance().getTransport(TransportType.SPORT_CAR);
        sportCar.move();
        ITransport car = sportCar.clone();

        sportCar.stop();
        car.stop();
    }

}
