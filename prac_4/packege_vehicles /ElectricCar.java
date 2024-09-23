package vehicles;
public class ElectricCar extends Car {
//Поле batteryCapacity и его методы доступа
    private String batteryCapacity;
    public String getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

//Переопределение поля engineType для класса ElectricCar
    protected String engineType = "Electric";
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        System.out.print("Changing the engineType of this object is not available\n");
    }

//Переопределение поля vehicleType для класса ElectricCar
    protected String vehicleType = "Electric Car";
    public String getVehicleType() {
        return vehicleType;
    }
//Переопределение метода tooString для класса ElectricCar
    public void tooString() {
        System.out.print("Model: " + ElectricCar.this.getModel() + "\n");
        System.out.print("License: " + ElectricCar.this.getLicense() + "\n");
        System.out.print("Color: " + ElectricCar.this.getColor() + "\n");
        System.out.print("Year: " + ElectricCar.this.getYear() + "\n");
        System.out.print("Owner Name: " + ElectricCar.this.getOwnerName() + "\n");
        System.out.print("Insurance Number: " + ElectricCar.this.getInsuranceNumber() + "\n");
        System.out.print("Engine Type: " + ElectricCar.this.getEngineType() + "\n");
        System.out.print("Vehicle Type: " + ElectricCar.this.getVehicleType() + "\n");
        System.out.print("Battery Capacity: " + getBatteryCapacity() + "\n\n\n");
    }
//Конструктор
    public ElectricCar(
                String model,
                String license,
                String color,
                String year,
                String ownerName,
                String insuranceNumber,
                String engineType,
                String vehicleType,
                String batteryCapacity)
    {
        ElectricCar.this.setModel(model);
        ElectricCar.this.setLicense(license);
        ElectricCar.this.setColor(color);
        ElectricCar.this.setYear(year);
        ElectricCar.this.setOwnerName(ownerName);
        ElectricCar.this.setInsuranceNumber(insuranceNumber);
        ElectricCar.this.setEngineType(engineType);
        ElectricCar.this.setVehicleType(vehicleType);
        ElectricCar.this.setBatteryCapacity(batteryCapacity);
    }
}
