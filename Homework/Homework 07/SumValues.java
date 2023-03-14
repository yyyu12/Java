import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class SumValues {

    public static String[] input(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filename)))) {
            Stream<String> s = br.lines();
            return s.collect(Collectors.joining(",")).split(",");
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        return null;

    }
    
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(new File("input.txt"));
                BufferedReader br = new BufferedReader(fr);
                PrintWriter pw = new PrintWriter(new File("output2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int sum = 0;
                for (int i = 0; i < values.length; i++) {
                    sum += Integer.parseInt(values[i]);
                }
                System.out.println(sum);
                // String output = Integer.valueOf(sum).toString();
                // bw.write(output, 0, output.length());
                // bw.newLine();
                pw.println(sum);
            }

        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
