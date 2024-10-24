public class TestCircleRectangle {
    public static void main(String[] args) throws Triangle.IllegalArgumentException {
        Triangle triangle = new Triangle();
        triangle.cinTriangle();
        System.out.println(triangle.toString());

        ComparableCircle circle1 = new ComparableCircle(0.5);
        ComparableCircle circle2 = new ComparableCircle(1.0);
        System.out.print("Поиск большего из circle1 и circle2: "); circle1.max(circle2);

        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        Rectangle rectangle2 = new Rectangle(6.0, 4.0);
        System.out.print("Поиск большего из rectangle1 и rectangle2: "); rectangle1.max(rectangle2);

        System.out.print("Поиск большего из circle1 и rectangle1: "); circle1.compareTo(rectangle1);
        System.out.print("Поиск большего из rectangle2 и circle2: "); rectangle2.compareTo(circle2);
    }
}
