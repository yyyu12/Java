public class Pizza {

    private final double diameter;
    private final String[] toppings;
    private final Time bakeTime;
    private final Time deliveryTime;

    public Pizza(double diameter, String[] toppings, Time deliveryTime) throws TypeNotPresentException {
        this.diameter = diameter;
        this.toppings = toppings;
        this.deliveryTime = deliveryTime;
        bakeTime = new Time((int)diameter * toppings.length);
    }

}
