public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getArea() {
        return length * width;
    }
    
}
