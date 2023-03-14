public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

}