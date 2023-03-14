
public class ColouredCircle extends Circle {
    
    private Colour color;

    public ColouredCircle(double x, double y, double radius, Colour color) {
        super(x, y, radius);
        this.color = color;
    }

    public Colour getColour() {return color;}

    public ColouredPoint getCenter() {
        return new ColouredPoint(getX(), getY(), color);
    }

    public static void main(String[] args) {
        ColouredCircle cc = new ColouredCircle(1.0, 1.0, 2.0, Colour.RED);
        System.out.println(cc.getArea());
        System.out.println(cc.getColour());
        ColouredPoint cp = cc.getCenter();
        System.out.println(cp.getColour());
    }

}
