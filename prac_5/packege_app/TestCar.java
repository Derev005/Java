package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        //Создание объекта класса Car
        Car car = new Car();
        car.setModel("Mazda");
        car.setLicense("k391jk134");
        car.setColor("Black");
        car.setYear("2009");
        car.setOwnerName("Vladimir");
        car.setInsuranceNumber("830527694380");

        //Создание объекта класса ElectricCar
        ElectricCar electricCar = new ElectricCar();
        electricCar.setModel("Moskvich");
        electricCar.setLicense("j000ls134");
        electricCar.setColor("White");
        electricCar.setYear("2020");
        electricCar.setOwnerName("Vladimir");
        electricCar.setInsuranceNumber("Alexey");
        electricCar.setBatteryCapacity("75");

        //Вывод информации о транспортных средствах
        System.out.print("Вывод информации о транспортном средстве класса Car:");
        car.ToString();
        System.out.print("\n\nВывод информации о транспортном средстве класса ElectricCar:");
        electricCar.ToString();
    }
}
