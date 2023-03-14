import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class PizzaMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(new File("in_ex5.txt"));
            BufferedReader br = new BufferedReader(fr)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                double diameter = Double.parseDouble(values[0]);
                String[] toppings = values[1].split(",");
                Time deliveryTime = new Time(Integer.parseInt(values[2]));
                Pizza p = new Pizza(diameter, toppings, deliveryTime);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (TypeNotPresentException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
