public class ComparableCircle extends Circle implements Comparable {
    public void max(Circle c1, Circle c2) {
        if (c1.getArea() > c2.getArea()) {
            System.out.print("Первый объект больше второго!\n");
        }
        else {
            System.out.print("Второй объект больше или равен первому!\n");
        }
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
