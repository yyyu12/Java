import polyhedra.Cylinder;
import polyhedra.Cube;

public class polyhedraMain {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(10, 5);
        System.out.println(c1);
        System.out.println("The cylinder's base area is " + c1.baseArea());
        System.out.println("The cylinder's volume is " + c1.volume());

        Cube cu1 = new Cube(4);
        System.out.println(cu1);
        System.out.println("The cube's base area is " + cu1.baseArea());
        System.out.println("The cube's volume is " + cu1.volume());
    }
}
