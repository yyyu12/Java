import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Task3Main{
    public static void main(String[] args){
        System.out.print("Enter a sample to ind in the file:");
        String sample = System.console().readLine();

        File input = new File(args[0]);
        Scanner sc = null;

        try{
            sc = new Scanner(input);

            int counter = 0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains(sample)){
                    ++counter;
                }
            }
            System.out.println("Counter = " + counter);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }

}
