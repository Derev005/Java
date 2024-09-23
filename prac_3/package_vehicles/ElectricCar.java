package vehicles;
public class ElectricCar extends Car {
    //Поле batteryCapacity и его методы доступа
    private String batteryCapacity;
    public String getbatteryCapacity() {
        return batteryCapacity;
    }
    public void setbatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    //Переопределение поля engineType и его методов
    protected String engineType = "Electric";
    public String getengineType() {
        return engineType;
    }
    public void setengineType(String engineType) {
        System.out.print("Changing the engineType of this object is not available\n");
    }
}
