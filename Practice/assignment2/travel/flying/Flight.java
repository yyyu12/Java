package assignment2.travel.flying;

import assignment2.travel.DateAndTime;
import assignment2.travel.Destination;

public class Flight {
    protected String name;
    protected Destination destinationCity;
    protected int numberOfTravellers;
    protected DateAndTime flightDateAndTime;

    public String getName() {
        return name;
    }

    public String getDestinationCity() {
        return destinationCity.getString();
    }

    public int getNumberOfTravellers() {
        return numberOfTravellers;
    }

    public String getFlightDateAndTime() {
        return flightDateAndTime.getDateAndTime();
    }

    public Flight(String name, Destination destinationCity, int numberOfTravellers, DateAndTime flightDateAndTime){
        if(numberOfTravellers >= 15 && numberOfTravellers <= 100){
            this.numberOfTravellers = numberOfTravellers;
        }else{
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.destinationCity = destinationCity;
        this.flightDateAndTime = flightDateAndTime;
    }

    public Flight(){
        this("Airbus", Destination.ROME, 83,  new DateAndTime());
    }

    // You need to use one of enum's method here
    public String getFlightDuration(){
        return "Flying " + getName() + " with " + getNumberOfTravellers() + " passengers to " + this.getDestinationCity() + " on " + this.getFlightDateAndTime();  
    }

    

}
