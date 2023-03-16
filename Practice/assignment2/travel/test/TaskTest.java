package assignment2.travel.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import assignment2.travel.DateAndTime;
import assignment2.travel.Destination;
import assignment2.travel.DestinationUtils;
import assignment2.travel.flying.FlightWithManyPlanes;
import assignment2.travel.flying.Plane;

public class TaskTest {
    
    final String FILE1 = "file1.txt";
    final String FILE2 = "file2.txt";

    // Test task1
    @Test
    public void testdateAndTime(){
        DateAndTime dateAndTime = new DateAndTime();
        assertEquals(2021, dateAndTime.getYear());
        assertEquals(12, dateAndTime.getMonth());
        assertEquals(22, dateAndTime.getDay());
        assertEquals(04, dateAndTime.getHour());
        assertEquals(30, dateAndTime.getMinute());

        DateAndTime dateAndTime1 = new DateAndTime(2023, 01, 15, 11, 36);
        assertEquals(2023, dateAndTime1.getYear());
        assertEquals(01, dateAndTime1.getMonth());
        assertEquals(15, dateAndTime1.getDay());
        assertEquals(11, dateAndTime1.getHour());
        assertEquals(36, dateAndTime1.getMinute());
    }
    
    @Test
    public void testDestinationUtils(){
        assertEquals(Destination.ROME, DestinationUtils.getDestination("01:45"));
        assertEquals("01:45", DestinationUtils.getDestinationDuration(Destination.ROME));
        assertEquals(3, DestinationUtils.getRoundedHours(Destination.HELSINKI));
    }

    //Test task2
    @Test
    public void testEquals(){
        assertTrue(Plane.getPlane("Star1", 112, 1200).equals(Plane.getPlane("Star1", 112, 1200)));
        assertFalse(Plane.getPlane("Star1", 112, 1200).equals(Plane.getPlane("Star2", 113, 1300)) );
    }

    @Test
    public void testHashCode(){
        Plane plane1 = Plane.getPlane("Star1", 112, 1200);
        Plane plane2 = Plane.getPlane("Star1", 112, 1200);
        int hash1 = plane1.hashCode();
        int hash2 = plane2.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testEstimatedArrivalTime() {
        // Two test cases
        Plane plane = Plane.getPlane("Star", 112, 1200);
        assertEquals(17, plane.estimatedArrivalTime(Destination.ROME, 15));
    }

    //Testing Task3
    @Test
    public void testLoad(){   
        String name = "WhiteStar";
        Destination destinationCity = Destination.BERLIN;
        int numberOfTravellers = 25; 
        DateAndTime flightDateAndTime = new DateAndTime(2023, 01, 15, 12, 36);
        ArrayList<Plane> planes = new ArrayList<>();
        planes.add(Plane.getPlane("WhiteStar1", 11, 110));
        planes.add(Plane.getPlane("WhiteStar2", 21, 210));
        planes.add(Plane.getPlane("WhiteStar3", 31, 310));
        FlightWithManyPlanes fwmPlanes;

        fwmPlanes = new FlightWithManyPlanes(name, destinationCity, numberOfTravellers, flightDateAndTime, planes);
        fwmPlanes.load(FILE1);

        Plane p = fwmPlanes.getOneOfFromManyPlane(0);
        
        assertFalse(p.getId() == 12);
        assertTrue(p.getName() == "WhiteStar1");
        assertTrue(p.toString().compareTo("BuleStar1,12,100") != 0);

    }
    
    @Test
    public void testSave(){
        String name1 = "BuleStar";
        int numberOfTravellers1 = 36; 
        ArrayList<Plane> planes1 = new ArrayList<>();
        Destination destinationCity1 = Destination.ROME;
        DateAndTime flightDateAndTime1 = new DateAndTime(2023, 01, 15, 12, 36);
        planes1.add(Plane.getPlane("BuleStar1", 12, 100));
        planes1.add(Plane.getPlane("BuleStar2", 36, 110));
        planes1.add(Plane.getPlane("BuleStar3", 48, 120));
        FlightWithManyPlanes fwmPlanes1;

        fwmPlanes1 = new FlightWithManyPlanes(name1, destinationCity1, numberOfTravellers1, flightDateAndTime1, planes1);
        fwmPlanes1.save(FILE2);
        fwmPlanes1.load(FILE2);
    
        Plane p1 = fwmPlanes1.getOneOfFromManyPlane(0);
            
        assertTrue(p1.getTicketPrice() != 110);
        assertFalse(p1.getName() == "BuleStar");
        assertTrue(p1.toString().compareTo("BuleStar1,12,100") == 0);         
    }



}
