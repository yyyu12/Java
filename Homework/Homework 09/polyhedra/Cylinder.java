package polyhedra;

public class Cylinder extends Prism {

    private double h;
    private double r;

    public Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public double baseArea() {
        return Math.PI * r * r;
    }

    public double volume() {
        return baseArea() * h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cylinder: (");
        sb.append("h=");
        sb.append(h);
        sb.append(", ");
        sb.append("r=");
        sb.append(r);
        sb.append(')');
        return sb.toString();
    }
    
}
