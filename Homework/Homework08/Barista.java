public class Barista {

    public static boolean order(Beverage beverage, Guest guest) {
        if (beverage.getLegalAge() == 18 && guest.getClass().getName().equals("Minor")) return false;
        return true;
    }
    
    public static void main(String[] args) {
        Beverage b1 = new Beverage("Coca Cola", 4);
        Beverage b2 = new Beverage("Cock tail", 18);
        Adult a1 = new Adult("Jack", 20);
        Adult a2 = new Adult("Charlie", 22);
        Minor m1 = new Minor("Jack", 16);
        System.out.println("Should be true: " + Barista.order(b1, a1));
        System.out.println("Should be true: " + Barista.order(b2, a2));
        System.out.println("Should be false: " + Barista.order(b2, m1));
    }
}
