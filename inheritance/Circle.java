public class Circle extends Shape {
    private int radius;

    public Circle() {
        radius = 3;
    }

    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
