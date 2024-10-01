package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    //Поле batteryCapacity и его метода доступа имплементированные из интерфейса
    private String batteryCapacity;
    public String getBatteryCapacity() {
        return batteryCapacity + " %";
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //Реализация метода ToString()
    public void ToString() {
        System.out.print("\nModel: " + getModel() + "\nLicense: " + getLicense() + "\nColor: " +
                getColor() + "\nYear: " + getYear() + "\nOwnerName: " + getOwnerName() + "\nInsuranceNumber: " +
                getInsuranceNumber() + "\nEngineType: " + getEngineType() + "\nVehicleType: " + vehicleType() +
                "\nBatteryCapacity: " + getBatteryCapacity());
    }

    //Конструктор класса ElectricCar
    public ElectricCar() { this.engineType = "Electric"; }
}
