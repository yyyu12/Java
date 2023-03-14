public class ColouredPoint extends Point {

    private Colour color;

    public ColouredPoint(double x, double y, Colour color) {
        super(x, y);
        this.color = color;
    }

    public Colour getColour() {return color;}
    public void setColour(Colour color) {this.color = color;}
    
}
