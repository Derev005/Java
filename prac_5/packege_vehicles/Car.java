package vehicles;

public class Car extends Vehicle {
    //Реализация метода vehicleType()
    public String vehicleType() { return "Car"; }

    //Реализация метода ToString()
    public void ToString() { System.out.print("\nModel: " + getModel() + "\nLicense: " + getLicense() + "\nColor: " +
            getColor() + "\nYear: " + getYear() + "\nOwnerName: " + getOwnerName() + "\nInsuranceNumber: " +
            getInsuranceNumber() + "\nEngineType: " + getEngineType() + "\nVehicleType: " + vehicleType()); }

    //Конструктор
    public Car() { this.engineType = "Combustion"; }
}
