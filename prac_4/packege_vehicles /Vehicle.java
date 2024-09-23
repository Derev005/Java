package vehicles;
public class Vehicle {
//Поле model и его методы доступа
    private String model;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

//Поле license и его методы доступа
    private String license;
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }

//Поле color и его методы доступа
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

//Поле year и его методы доступа
    private String year;
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

//Поле ownerName и его методы доступа
    private String ownerName;
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

//Поле insuranceNumber и его методы доступа
    private String insuranceNumber;
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

//Поле engineType и его методы доступа
    protected String engineType;
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

//Поле vehicleType и его методы доступа
    protected String vehicleType;
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
//Конструктор
    public Vehicle() {}
}
