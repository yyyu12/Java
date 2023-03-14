import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class FindSum {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(new File("in.txt"));
             BufferedReader br = new BufferedReader(fr);
             PrintWriter pw = new PrintWriter(new File("out.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                int key = Integer.parseInt(values[0]);
                String[] numbers = values[1].split(",");
                int count = 0;
                for (int i = 0; i < numbers.length; i++) {
                    int x = Integer.parseInt(numbers[i]);
                    for (int j = i+1; j < numbers.length; j++) {
                        int y = Integer.parseInt(numbers[j]);
                        if (x + y == key) {
                            pw.println(key + " " + x + " " + y);
                            count++;
                        }
                    }
                }

                if (count == 0) {
                    pw.println(key + " none");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
