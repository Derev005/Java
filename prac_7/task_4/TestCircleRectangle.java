public class TestCircleRectangle {
    public static void main(String[] args) throws Triangle.IllegalArgumentException {
        GeometricObject [] geometricObject = new GeometricObject[5];

        geometricObject[0] = new Circle(5.0);
        geometricObject[1] = new Rectangle(5.0, 4.0);
        geometricObject[2] = new Triangle(3.0, 5.0, 4.0);
        geometricObject[3] = new Square(6.0);
        geometricObject[4] = new GeometricObject();

        for (int i = 0; i < geometricObject.length; i++) {
            System.out.println(geometricObject[i].toString());
        }

        for (int i = 0; i < geometricObject.length; i++) {
            geometricObject[i].howToColor();
        }
    }
}
