package Circle;
import java.io.*;

public class CircleMain{
    public static void main(String[] args){
        Circle circle = new Circle(4,3,11);
        System.out.println("The circle is " + circle);

        circle.enlarge(3);
        System.out.println("The circle is " + circle);

        Circle circle2 = null;

        try{
            circle.saveToFile("./src/Circle/copy.txt");

            circle2 = Circle.readFromFile("./src/Circle/data.txt");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Circle2 : " + circle2);
    }
}