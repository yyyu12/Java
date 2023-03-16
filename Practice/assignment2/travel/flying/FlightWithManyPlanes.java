package assignment2.travel.flying;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import assignment2.travel.DateAndTime;
import assignment2.travel.Destination;

public class FlightWithManyPlanes extends Flight {
    
    ArrayList<Plane> planes;

    public FlightWithManyPlanes(String name, Destination destination, int numberOfTravellers, DateAndTime flightDateAndTime, ArrayList<Plane> planes){
        super(name, destination, numberOfTravellers, flightDateAndTime);
        this.planes = planes;
    }

    public Plane getOneOfFromManyPlane(int index){
        return planes.get(index);
    }

    public void save(String fileName){
        String dirPath = "src/assignment2/travel/flying/";
        String urlFileName = dirPath + fileName;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(urlFileName));){

            bw.write(super.getName() + "\n");
            bw.write(super.destinationCity.name() + "\n");
            bw.write(String.valueOf(super.getNumberOfTravellers()) + "\n");
            bw.write(super.getFlightDateAndTime() + "\n");

            for (Plane plane : planes) {
                bw.write(plane.toString() + "\n");
            }
            
        } catch (IOException e) {
            // e.printStackTrace();
        }
    }

    public void load(String fileName){
        
        String dirPath = "src/assignment2/travel/flying/";
        String urlFileName = dirPath + fileName;
        File file = new File(urlFileName);

        // read the file
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            String name = new String(br.readLine());
            Destination destination = Destination.valueOf(br.readLine());
            int numberOfTravellers = Integer.parseInt(br.readLine());
            // DateAndTime skip
            
            ArrayList<Plane> planes = new ArrayList<>();

            String line = br.readLine();
            line = line.strip();
            while(line != null){
                String[] parts = line.split(",");

                String planeName = parts[0];
                int id = Integer.parseInt(parts[1]);
                int ticketPrice = Integer.parseInt(parts[2]);
                
                planes.add(Plane.getPlane(planeName, id, ticketPrice));
            }

            super.name = name;
            this.planes = planes;
            super.destinationCity = destination;
            super.flightDateAndTime = new DateAndTime();
            super.numberOfTravellers = numberOfTravellers;
            
        } catch (IOException e) {
            //System.err.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException ae){
            //...
        }
    }

    public Plane getCheapestRide(double discountRateIncrease){
        if(planes.size() == 0){
            throw new IllegalStateException();
        }

        int numTimes = 1;
        Plane cheapestPlane = this.planes.get(0);
        double minPrice = cheapestPlane.getPrice(0);

        for(Plane p: planes){
            double price = p.getPrice(discountRateIncrease * numTimes);

            if(price < minPrice){
                cheapestPlane = p;
                minPrice = price;
            }

            numTimes++;
        }

        return cheapestPlane;
    }
}
