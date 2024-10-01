package vehicles;

public abstract class Vehicle {
    //Поле model и его метода доступа
    protected String model;
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    //Поле license и его метода доступа
    protected String license;
    public String getLicense() {return license;}
    public void setLicense(String license) {this.license = license;}

    //Поле color и его метода доступа
    protected String color;
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    //Поле year и его метода доступа
    protected String year;
    public String getYear() {return year;}
    public void setYear(String year) {this.year = year;}

    //Поле ownerName и его метода доступа
    protected String ownerName;
    public String getOwnerName() {return ownerName;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}

    //Поле insuranceNumber и его метода доступа
    protected String insuranceNumber;
    public String getInsuranceNumber() {return insuranceNumber;}
    public void setInsuranceNumber(String insuranceNumber) {this.insuranceNumber = insuranceNumber;}

    //Поле engineType и его метод доступа
    protected String engineType;
    public String getEngineType() {return engineType;}

    //Определение метода ToString
    public abstract void ToString();

    //Определение абстрактного метода vehicleType
    public abstract String vehicleType();
}
