import java.security.InvalidParameterException;

public class MathUtils {

    public static int Increment(int i) throws InvalidParameterException {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        else {
            throw new InvalidParameterException("Increment Failed: The integer to be incremented is already the largest representable integer.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test normal cases for random integers");
        int i1 = 1;
        int i2 = 0;
        int i3 = -2;
        int i4 = Integer.MIN_VALUE;
        System.out.println(i1 + " after increment is " + MathUtils.Increment(i1));
        System.out.println(i2 + " after increment is " + MathUtils.Increment(i2));
        System.out.println(i3 + " after increment is " + MathUtils.Increment(i3));
        System.out.println(i4 + " after increment is " + MathUtils.Increment(i4));

        System.out.println();
        System.out.println("Test the extreme case: add 1 to the largest representable integer. Error should occur");
        int i5 = Integer.MAX_VALUE;
        try {
            System.out.println(i5 + " after increment is " + MathUtils.Increment(i5));
        }
        catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }
    }

}