public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /*
    public Point mirror(double cx, double cy) {
        return new Point(cx*2 - x, cy*2 - y);
    }
    */

    public Point mirror(Point p) {
        return new Point(p.x*2 - x, p.y*2 - y);
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
    }

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
}
