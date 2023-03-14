/**
 * @author Yang, Yuanhua
 * @version 1.0
 * @since March 27th, 2022
 * IntVector is a class that represents a row-column vector where all the entries are of integer type
 * It implements a method called append() that will add one more element to the current vector
 * It also implements a static method sum() that will take two IntVector types as parameters and return a new IntVector type which is the element-wise sum of the parameters. 
 */

package util;

import java.util.Arrays;

public class IntVector {

    private int[] numbers;

    public IntVector(int[] numbers) {
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
    }

    public void add(int n) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] += n;
    }

    /**
     * Method append(int n) takes in an integer n and add n to the end of the current vector
     * @param n
     */
    public void append(int n) {
        int l = numbers.length;
        int[] newNumbers = new int[l + 1];
        for (int i = 0; i < l; i++) {
            newNumbers[i] = numbers[i];
        }
        newNumbers[l] = n;
        numbers = newNumbers;
    }

    public String toString() {
        return Arrays.toString(numbers);
    }

    /**
     * Static method sum will take two IntVector types as parameters and return a new IntVector type which is the element-wise sum of the two parameters
     * @param iv1 
     * @param iv2 
     * @return a new IntVector object that is the element-wise sum of iv1 and iv2
     */
    public static IntVector sum(IntVector iv1, IntVector iv2) {
        if (iv1.numbers.length != iv2.numbers.length) {
            System.err.println("Sizes of two vectors do not match.");
            return null;
        }
        else {
            int[] s = new int[iv1.numbers.length];
            for (int i = 0; i < s.length; i++) {
                s[i] = iv1.numbers[i] + iv2.numbers[i];
            }
            return new IntVector(s);
        }
    }
    
}
