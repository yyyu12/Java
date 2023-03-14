import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger extends Logger{

    @Override
    public void log(String str) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(new File("out.txt"), true))) {
            pw.println(str);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
