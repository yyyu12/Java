import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class ReadParity {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(new File("nums.txt"));
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(new File("out_ex3.txt"));
            BufferedWriter bw = new BufferedWriter(fw)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                int x = Integer.parseInt(line);
                StringBuilder sb = new StringBuilder();
                String output = Integer.valueOf(x).toString();
                sb.append(output);
                if (x % 2 == 0) {
                    sb.append(" is an even number");
                }
                else {
                    sb.append(" is an odd number");
                }
                output = sb.toString();
                bw.write(output, 0, output.length());
                bw.newLine();
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
