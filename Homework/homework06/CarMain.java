import car.Car;
import car.utils.Color;
import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;


public class CarMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(new File("in_ex4.txt"));
            BufferedReader br = new BufferedReader(fr)) {

            Car[] cars = new Car[4];
            cars[0] = new Car();
            int i = 1;
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[1].equals("BLUE")) {
                    cars[i] = new Car(values[0], Color.BLUE, Integer.parseInt(values[2]));
                }
                else if (values[1].equals("RED")) {
                    cars[i] = new Car(values[0], Color.RED, Integer.parseInt(values[2]));
                }
                else {
                    cars[i] = new Car(values[0], Color.GREEN, Integer.parseInt(values[2]));
                }
            }
            System.out.println("There are " + Car.CarCount + " cars created in total.");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
