public class Square extends GeometricObject implements Colorable {
    //---Fields of a class---
    private double side;
    //---Methods of a class---
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    public double getArea() { return side * side; }
    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Квадрат:\n" + "Создан: " + getDateCreated() + "\nСторона: " + side + "\nЦвет: " + getColor() +
                "\nЗаливка: " + isFilled() + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea() + "\n";
    }
    //---implementation to the interface---
    public void howToColor() {
        System.out.print("Расскрасте все четыре стороны!\n");
    }
    //---Constructors---
    public Square() {
        this.side = 0.0;
    }
    public Square(double side) {
        this.side = side;
    }
}
