package assignment2.travel.flying;

import java.util.Objects;

import assignment2.travel.Destination;
import assignment2.travel.DestinationUtils;

public class Plane extends Flight implements Flyable {
    String name;
    int id, ticketPrice;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public int getTicketPrice() {
        return ticketPrice;
    }

    private Plane(String name, int id, int ticketPrice){
        if(name == null & ticketPrice > 10 ){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.id = id;
        this.ticketPrice = ticketPrice;
    }

    public static Plane getPlane(String name, int id, int ticketPrice){
        return new Plane(name, id, ticketPrice);
    }

    public static Plane make(String data){
        String[] parts = data.split(",");
        int[] idAndTicketPrice = new int[2];
        for(int i = 1; i < parts.length; i++){
            idAndTicketPrice[i-1] = Integer.parseInt(parts[i]);
        }
        return new Plane(parts[0], idAndTicketPrice[0], idAndTicketPrice[1]);
    }

    public int estimatedArrivalTime(Destination destination, int departHour) {
        int flyingHour = DestinationUtils.getRoundedHours(destination);
        return departHour + flyingHour;
    }

    public double getPrice(double discountRate) {
        return ticketPrice * (1-discountRate);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return id == plane.id && 
                ticketPrice == plane.ticketPrice && 
                name.equals(plane.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, id, ticketPrice);
    }

    @Override
    public String toString(){
        return this.name + "," + this.id + "," + this.ticketPrice;
    } 

}
