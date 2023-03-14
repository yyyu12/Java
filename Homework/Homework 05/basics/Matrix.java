package basics;

import javax.management.InvalidAttributeValueException;

/**
 * @author Yang Yuanhua
 * @version 1.0
 * @since March 27th, 2022
 * The java file Matrix.java implements a class named Matrix. It represents a row-column matrix storing values of double type as entries
 * It implements three constructors. One constructor requires two integer values indicating row number and column number respectively. It initialize the matrix with all entries of value 0
 * The second constructor requires two integer values indicating row number and column number respectively, and an array of double values containing the values of all entries
 * The third constructor is of the static type. It takes in an integer N and initialize an identity matrix with size N*N.
 * The Matrix class also implements two methods regarding the addition and subtraction of matrices with same row-column sizes.
 * It also has a method which returns the transpose of the current matrix.
 * Finally, it has a toString() method that will return a String representation of the matrix 
 */

public class Matrix {

    private int rowNum;
    private int colNum;
    private double[] entries;

    /**
     * The constructor that takes in the row number M and column number N
     * It will initialize a matrix of size M*N and all entries are set to 0
     * @param rowNum int number of rows
     * @param colNum int number of columns
     */
    public Matrix(int rowNum, int colNum) throws InvalidAttributeValueException {
        if (rowNum <= 0 || colNum <= 0) throw new InvalidAttributeValueException("row and column number can not be less than or equal to 0");
        this.rowNum = rowNum;
        this.colNum = colNum;
        entries = new double[rowNum * colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                entries[i * colNum + j] = 0.0;
            }
        }
    }
    
    /**
     * The constructor that takes in a row number M and column number N and an array of double values.
     * It initialize a matrix of size M*N and set all entry values to the values in the double array respectively.
     * @param rowNum int number of rows
     * @param colNum int number of columns
     * @param entries double[] all entry values
     */
    public Matrix(int rowNum, int colNum, double[] entries) throws InvalidAttributeValueException {
        if (rowNum * colNum != entries.length) throw new InvalidAttributeValueException("the size of the matrix does not match.");
        if (rowNum <= 0 || colNum <= 0) throw new InvalidAttributeValueException("row and column number can not be less than or equal to 0");
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.entries = entries;
    }

    /**
     * The identityMatrix static method will take in an integer N indicating the size of the matrix. It will return an identity matrix of size N*N
     * @param size int showing the row and column number
     * @return a new Matrix object m that is a square matrix and an identity matrix of size size*size
     */
    public static Matrix identityMatrix(int size) {
        try {
            Matrix m = new Matrix(size, size);
            for (int i = 0; i < size; i++) {
                m.entries[i * size + i] = 1.0;
            }
            return m;
        }
        catch(InvalidAttributeValueException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * The method tanspose() will return the transpose of this matrix
     * @return 
     */
    public Matrix tranpose() {
        try {
            Matrix m = new Matrix(colNum, rowNum);
            for (int i = 0; i < m.rowNum; i++) {
                for (int j = 0; j < m.colNum; j++) {
                    m.entries[i * m.colNum + j] = entries[j * colNum + i];
                }
            }
            return m;
        }
        catch (InvalidAttributeValueException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * Method add will take in a matrix object m and return the sum of this and m.
     * @param m
     * @return Matrix sum representing the sum of this and m
     */
    public Matrix add(Matrix m) throws InvalidAttributeValueException{
        if (rowNum != m.rowNum || colNum != m.colNum) throw new InvalidAttributeValueException("The size does not match");
        try {
            Matrix sum = new Matrix(rowNum, colNum);
            for (int i = 0; i < rowNum; i++) {
                for (int j = 0; j < colNum; j++) {
                    sum.entries[i * colNum + j] = entries[i * colNum + j] + m.entries[i * colNum + j];
                }
            }
            return sum;
        }
        catch (InvalidAttributeValueException e) {
            System.err.println(e);
            return null;
        }
    }

    public Matrix diff(Matrix m) throws InvalidAttributeValueException{
        if (rowNum != m.rowNum || colNum != m.colNum) throw new InvalidAttributeValueException("The size does not match");
        try {
            Matrix diff = new Matrix(rowNum, colNum);
            for (int i = 0; i < rowNum; i++) {
                for (int j = 0; j < colNum; j++) {
                    diff.entries[i * colNum + j] = entries[i * colNum + j] - m.entries[i * colNum + j];
                }
            }
            return diff;
        }
        catch (InvalidAttributeValueException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * The method toString() will return a string representation of this matrix object.
     * Each row is delimited by a new line character, and each column is delimited by space.
     * @return a string representing the matrix
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowNum; i++) {
            if (i != 0) sb.append('\n');
            for (int j = 0; j < colNum; j++) {
                if (j != 0) sb.append("  ");
                sb.append(entries[i * colNum + j]);
            }
        }
        return sb.toString();
    }

    
}
