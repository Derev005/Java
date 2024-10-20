public class Rectangle extends GeometricObject implements Colorable {
    //---Fields of a class---
    private double width, height;
    //---Methods of a class---
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }

    public void max(Rectangle rectangle) {
        if (this.getArea() > rectangle.getArea()) {
            System.out.print("Первый объект больше второго!\n");
        }
        else {
            System.out.print("Второй объект больше или равен первому!\n");
        }
    }
    public void compareTo(Circle circle) {
        if (this.getArea() < circle.getArea()) {
            System.out.print("Первый объект больше второго!\n");
        }
        else {
            System.out.print("Второй объект больше или равен первому!\n");
        }
    }

    public String toString() {
        return "Прямоугольник:\n" + "Создан: " + getDateCreated() + "\nВвысота: " + width + "\nШирина: " + height + "\nЦвет: " + getColor() +
                "\nЗаливка: " + isFilled() + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea() + "\n";
    }
    //---implementation to the interface---
    public void howToColor() {
        System.out.print("Расскрасте прямоугольник!\n");
    }
    //---Constructors---
    public Rectangle() {
    }
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
}
