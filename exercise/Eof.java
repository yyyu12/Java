import java.util.Scanner;

public class Eof {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineNum = 0;
        while(sc.hasNext())
            System.out.println(++lineNum + " " + sc.nextLine());  
            
        sc.close();
    }
}
