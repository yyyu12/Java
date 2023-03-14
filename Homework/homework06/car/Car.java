package car;

import car.utils.Color;

public class Car {
    
    private String licensePlate;
    private Color color;
    private int maxSpeed;
    public static int CarCount;

    public Car(String licensePlate, Color color, int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.maxSpeed = maxSpeed;
        CarCount++;
    }

    public Car() {
        licensePlate = "AAA-000";
        color = Color.BLUE;
        maxSpeed = 120;
        CarCount++;
    }

    public boolean fasterThan(Car otherCar) {
        return this.maxSpeed > otherCar.maxSpeed;
    }



}
