public class rectangleTest {

    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        r1.length = 5;
        r1.width = 3;

        System.out.println("Area: " + r1.CalArea());
        System.out.println("Perimeter: " + r1.CalPerimetre());
    }
}