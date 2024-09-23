package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Class Car");
        Car car = new Car("Mazda", "k391jk134", "Black", "2009", "Vladimir",
                "830527694380", "DVS", "Coupe");
        System.out.println(car.toString() + '\n');
        car.tooString();

        System.out.println("Class ElectricCar");
        ElectricCar electricCar = new ElectricCar("Moskvich", "j000ls134", "White", "2024",
                "Alexey", "02937395840", "DVS", "Sedan", "34");
        System.out.println(electricCar.toString() + '\n');
        electricCar.tooString();
    }
}
