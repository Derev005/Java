import java.util.Scanner;
public class Triangle extends GeometricObject implements Colorable {
    //---Fields of a class---
    private double side1, side2, side3;
    //---Methods of a class---
    public double getSide1() { return side1; }
    public void setSide1(double side1) { this.side1 = side1; }
    public double getSide2() { return side2;  }
    public void setSide2(double side2) { this.side2 = side2; }
    public double getSide3() { return side3; }
    public void setSide3(double side3) { this.side3 = side3; }

    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        return Math.pow((S * (S - side1) * (S - side2) * (S - side3)), 0.5);
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Треугольник:\n" + "Создан: " + getDateCreated() + "\nСторона 1: " + side1 + "\nСторона 2: " + side2 +
                "\nСторона 3: " + side3 + "\nЦвет: " + getColor() + "\nЗаливка: " + isFilled() + "\nПериметр: " + getPerimeter() +
                "\nПлощадь: " + getArea() + "\n";
    }

    public void cinTriangle() throws Triangle.IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите side1: "); double side1 = scanner.nextDouble();
        System.out.print("Введите side2: "); double side2 = scanner.nextDouble();
        System.out.print("Введите side3: "); double side3 = scanner.nextDouble();
        if (side1 >= (side2 + side3) || side2 >= (side1 + side3) || side3 >= (side1 + side2)) {
            throw new Triangle.IllegalArgumentException("Одна из сторон больше или равна сумме двух других");
        }
        this.setSide1(side1); this.setSide2(side2); this.setSide3(side3);
        System.out.print("Введите color: ");
        String color = scanner.next(); this.setColor(color);
        System.out.print("Введите filled('true'/'false'): ");
        boolean filled = scanner.nextBoolean(); this.setFilled(filled);
        System.out.print("\n");
    }
    //---implementation to the interface---
    public void howToColor() {
        System.out.print("Расскрасте треугольник!\n");
    }
    //---Constructors---
    public Triangle() {
        this.side1 = 1.0; this.side2 = 1.0; this.side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3) throws IllegalArgumentException {
        if (side1 >= (side2 + side3) || side2 >= (side1 + side3) || side3 >= (side1 + side2)) {
            throw new IllegalArgumentException("Одна из сторон больше или равна сумме двух других");
        }
        this.side1 = side1; this.side2 = side2; this.side3 = side3;
    }
    //---Exception class---
    static class IllegalArgumentException extends Exception {
        public IllegalArgumentException(String massege) {
            super(massege);
        }
    }
}
