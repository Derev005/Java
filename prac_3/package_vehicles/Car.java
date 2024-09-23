package vehicles;
public class Car {
    //Поле ownerName и его методы доступа
    private String ownerName;
    public String getownerName() {
        return ownerName;
    }
    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }
    //Поле insuranceNumber и его методы доступа
    private String insuranceNumber;
    public String getinsuranceNumber() {
        return insuranceNumber;
    }
    public void setinsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    //Поле endineType и его методы доступа
    protected String engineType;
    public String getengineType() {
        return engineType;
    }
    public void setengineType(String engineType) {
        this.engineType = engineType;
    }
}
