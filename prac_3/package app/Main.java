package app;

import vehicles.ElectricCar;
import vehicles.Car;

public class Main {
    public static void main(String[] args) {
        System.out.print("Class Car" + '\n');
        Car car = new Car();
        car.setengineType("DVS");
        car.setinsuranceNumber("893057294");
        car.setownerName("Victor");
        System.out.print("Engine Type: " + car.getengineType() + '\n');
        System.out.print("Insurance Number: " + car.getinsuranceNumber() + '\n');
        System.out.print("Owner Name: " + car.getownerName() + '\n' + '\n');

        System.out.print("Class ElectricCar" + '\n');
        ElectricCar electricCar = new ElectricCar();
        electricCar.setengineType("DVS");
        electricCar.setinsuranceNumber("0274938594");
        electricCar.setownerName("Alex");
        electricCar.setbatteryCapacity("79");
        System.out.print("Engine Type: " + electricCar.getengineType() + '\n');
        System.out.print("Insurance Number: " + electricCar.getinsuranceNumber() + '\n');
        System.out.print("Owner Name: " + electricCar.getownerName() + '\n');
        System.out.print("Battery Capacity: " + electricCar.getbatteryCapacity() + '\n');
    }
}
