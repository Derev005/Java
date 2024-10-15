public class Triangle extends GeometricObject {
    //---Fields of a class---
    private double side1, side2, side3;
    //---Methods of a class---
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        return Math.pow((S * (S - side1) * (S - side2) * (S - side3)), 2);
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Треугольник:\n" + "Создан: " + getDateCreated() + "\nСторона 1: " + side1 + "\nСторона 2: " + side2 +
                "\nСторона 3: " + side3;
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
