public class Rectangle implements Shape {
//public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
        length = 6;
        width = 4;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
