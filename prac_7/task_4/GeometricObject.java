public class GeometricObject implements Comparable, Colorable{
    //---Fields of a class---
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;
    //---Methods of a class---
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public java.util.Date getDateCreated() { return dateCreated; }

    public String toString() { return "Объект:\nCоздан: " + dateCreated + ",\nЦвет: " + color + "\nЗаливка: " + filled + "\n"; }
    //---implementation to the interface---
    public void max(Circle c1, Circle c2) {}

    public void howToColor() {
        System.out.print("Расскрасте объект!\n");
    }
    //---Constructors---
    public GeometricObject() { dateCreated = new java.util.Date(); }
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
}
