public class Circle extends GeometricObject {
    //---Fields of a class---
    private double radius;
    //---Methods of a class---
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return radius * radius * Math.PI; }

    public double getDiameter() { return 2 * radius; }

    public double getPerimeter() { return 2 * radius * Math.PI; }

    public void printCircle() { System.out.println("Круг создан " + getDateCreated() + " и радиус равен " + radius); }

    public void max(Circle circle) {
        if (this.getArea() > circle.getArea()) { System.out.print("Первый объект больше второго!\n"); }
        else { System.out.print("Второй объект больше или равен первому!\n"); }
    }

    public void compareTo(Rectangle rectangle) {
        if (this.getArea() < rectangle.getArea()) {
            System.out.print("Первый объект больше второго!\n");
        }
        else {
            System.out.print("Второй объект больше или равен первому!\n");
        }
    }
    //---Constructors---
    public Circle() { }
    public Circle(double radius) { this.radius = radius; }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
}
