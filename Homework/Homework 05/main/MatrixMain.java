package main;
import basics.Matrix;
import javax.management.InvalidAttributeValueException;

/**
 * @author Yang Yuanhua
 * @version 1.0
 * @since March 27th, 2022
 * The class MatrixMain contains a main function to test the performance of the class basics.Matrix
 */

public class MatrixMain {
    public static void main(String[] args) {
        try {
            // Test constructor
            Matrix m1 = new Matrix(2, 3);
            System.out.println(m1);
            
            double[] e1 = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
            Matrix m2 = new Matrix(1, 5, e1);
            System.out.println(m2);

            Matrix m3 = Matrix.identityMatrix(5);
            System.out.println(m3);

            // Test method transpose()
            System.out.println(m2.tranpose());
            System.out.println(m1.tranpose());

            // Test method add() and diff()
            double[] e2 = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
            double[] e3 = new double[]{2.0, 3.0, 4.0, 5.0, 6.0, 7.0};
            Matrix m4 = new Matrix(2, 3, e2);
            Matrix m5 = new Matrix(2, 3, e3);
            System.out.println(m4.add(m5));
            System.out.println(m4.diff(m5));
        }
        catch (InvalidAttributeValueException e) {
            System.err.println(e);
        }
    }
}
