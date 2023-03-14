public class ShapeMain {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("The perimeter of the square is " + square.getPerimeter());
        System.out.println("The area of the square is " + square.getArea());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is " + rectangle.getArea());

        Circle circle = new Circle(2);
        System.out.println("The perimeter of the circle is " + circle.getPerimeter());
        System.out.println("The area of the circle is " + circle.getArea());
    }
}
