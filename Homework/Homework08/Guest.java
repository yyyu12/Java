public class Guest {

    protected String name;
    protected int age;

    public Guest(String name, int age) throws IllegalArgumentException {
        if (name.isEmpty()) throw new IllegalArgumentException("Guest name cannot be empty");
        if (age <= 0) throw new IllegalArgumentException("Age should be a positive number");
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    
}
