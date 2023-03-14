package polyhedra;

public class Cube extends Prism {

    private double h;

    public Cube(double h) {
        this.h = h;
    }

    public double baseArea() {
        return h * h;
    }

    public double volume() {
        return baseArea() * h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cube: (");
        sb.append("h=");
        sb.append(h);
        sb.append(')');
        return sb.toString();
    }
    
}
