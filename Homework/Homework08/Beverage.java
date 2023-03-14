public class Beverage {

    private String name;
    private int legalAge;

    public Beverage(String name, int legalAge) throws IllegalArgumentException {
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        if (legalAge <= 0) throw new IllegalArgumentException("Age should be a positive number");
        this.name = name;
        this.legalAge = legalAge;
    }

    public String getName() {return name;}
    public int getLegalAge() {return legalAge;}

    
}
