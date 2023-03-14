package polyhedra;

public abstract class Prism {

    private double h;

    public abstract double baseArea();

    public abstract double volume();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prism: (");
        sb.append("h=");
        sb.append(h);
        sb.append(')');
        return sb.toString();
    }
    
}
