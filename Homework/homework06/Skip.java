import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
// import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Skip {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a number indicating the times of skip");
            System.exit(1);
        }
        try (FileReader fr = new FileReader(new File("in_ex2.txt"));
             BufferedReader br = new BufferedReader(fr)) {
            StringBuilder sb = new StringBuilder();
            int numToSkip = Integer.parseInt(args[0]);
            char c;
            while (br.ready()) {
                c = (char)br.read();
                sb.append(c);
                br.skip(numToSkip);
            }
            System.out.println(sb.toString());
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
