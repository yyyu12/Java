import utils.DoubleVector;

class DvMain {

    public static void main(String[] args) {
        double[] d_arr1 = {1.0,2.0,3.0};
        double[] d_arr2 = {2.0,4.0,6.0};
        double d = 1.5;

        DoubleVector dv1 = new DoubleVector(d_arr1);
        DoubleVector dv2 = new DoubleVector(d_arr2);

        System.out.println("The original vector is: " + dv1);
        System.out.println("The scalar product after multiplying with " + dv2 + " is: " + dv1.scalarProduct(dv2));
        System.out.println("The sum after adding " + dv2 + " is: " + dv1.sum(dv2));
        System.out.println("The difference after subtracting " + dv2 + " is: " + dv1.diff(dv2));
        System.out.println("The scalar product after multiplying with a double value " + d + " is: " + dv1.scalarProduct2(d));
    }


    
}
