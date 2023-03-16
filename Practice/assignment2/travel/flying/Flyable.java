package assignment2.travel.flying;

import assignment2.travel.Destination;

public interface Flyable {
    public int estimatedArrivalTime(Destination destination, int departHour);
    public double getPrice(double discountRate);

}
