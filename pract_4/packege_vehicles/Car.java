package vehicles;
public class Car extends Vehicle {
//Переопределение поля vehicleType для класса Car
    protected String vehicleType = "Car";
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        System.out.print("Changing the vehicleType of this object is not available\n");
    }

//Метод tooString()
    public void tooString() {
        System.out.print("Model: " + Car.this.getModel() + "\n");
        System.out.print("License: " + Car.this.getLicense() + "\n");
        System.out.print("Color: " + Car.this.getColor() + "\n");
        System.out.print("Year: " + Car.this.getYear() + "\n");
        System.out.print("Owner Name: " + Car.this.getOwnerName() + "\n");
        System.out.print("Insurance Number: " + Car.this.getInsuranceNumber() + "\n");
        System.out.print("Engine Type: " + Car.this.getEngineType() + "\n");
        System.out.print("Vehicle Type: " + Car.this.getVehicleType() + "\n\n\n");
    }
//Конструкторы
    public Car() {}
    public Car(String model,
               String license,
               String color,
               String year,
               String ownerName,
               String insuranceNumber,
               String engineType,
               String vehicleType)
    {
        Car.this.setModel(model);
        Car.this.setLicense(license);
        Car.this.setColor(color);
        Car.this.setYear(year);
        Car.this.setOwnerName(ownerName);
        Car.this.setInsuranceNumber(insuranceNumber);
        Car.this.setEngineType(engineType);
        Car.this.setVehicleType(vehicleType);
    }
}
