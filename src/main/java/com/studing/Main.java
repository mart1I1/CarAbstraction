package com.studing;

import com.studing.detail.Engine;
import com.studing.detail.Seat;
import com.studing.detail.Wheel;
import com.studing.detail.WheelBrand;
import com.studing.transport.Boat;
import com.studing.transport.ITransport;
import com.studing.transport.NiceCar;
import com.studing.transport.SportCar;

public class Main {

    public static void main(String[] args) {
        //niceCar создается при помощи композиции + наследование
        ITransport niceCar = new NiceCar();
        System.out.println(niceCar.toString());
        niceCar.move();
        niceCar.stop();

        //sportCar создается при помощи агрегации + наследование
        Engine engine = new Engine(200, 15);
        Seat seat = new Seat(true);
        Wheel wheel = new Wheel(WheelBrand.GOODYEAR, 40);
        ITransport sportCar = new SportCar(engine, seat, wheel);
        System.out.println(sportCar.toString());
        sportCar.move();
        sportCar.stop();

        ITransport boat = new Boat(engine, seat);
        boat.move();
        boat.stop();
    }

}
