/**
 * @author Yang, Yuanhua
 * @version 1.0
 * @since March 27th, 2022
 * TelevisionShop is a enum type that includes five types {SAMSUNG, LG, SKYWORTH, SONY, SHARP}
 * It defines a method to display availale sizes of all types, a method to display availale size of one type, and 
 * a method to display all information of all types.
 */

public enum TelevisionShop {

    SAMSUNG(10, 28, 40),
    LG(12, 32, 40),
    SKYWORTH(8, 36, 48),
    SONY(9, 20, 60),
    SHARP(23, 28, 40);

    final int numInStock;
    final int minDiag, maxDiag;

    /**
     * The constructor of the type TelevisionShop which takes in three parameters: 
     * one representing the number of stock
     * one representing the minimal available size of a type
     * one representing the maximal available size of a type
     * @param numInStock
     * @param minDiag
     * @param maxDiag
     */
    TelevisionShop(int numInStock, int minDiag, int maxDiag) {
        this.numInStock = numInStock;
        this.minDiag = minDiag;
        this.maxDiag = maxDiag;
    }

    /**
     * Method listAllSizes() will return a string containing available sizes of all types
     * @return
     */
    static String listAllSizes() {
        StringBuilder sb = new StringBuilder();
        for (TelevisionShop ts: TelevisionShop.values()) {
            sb.append(ts.ordinal());
            sb.append(": ");
            sb.append(ts);
            // sb.append(" Available Stock: ");
            // sb.append(ts.numInStock);
            sb.append(" Minimal Size Available: ");
            sb.append(ts.minDiag);
            sb.append("; Maximal Size Available: ");
            sb.append(ts.maxDiag);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    
    /**
     * Method listSizeOf(type) will return a string containing available sizes of a specific type as parameter
     * @param type a type in TelevisionShop
     * @return 
     */
    static String listSizeOf(TelevisionShop type) {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(" Minimal Size Available: ");
        sb.append(type.minDiag);
        sb.append("; Maximal Size Available: ");
        sb.append(type.maxDiag);
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    /**
     * Method listAllInfo() will return a string containing information of all types
     * @return
     */
    static String listAllInfo() {
        StringBuilder sb = new StringBuilder();
        for (TelevisionShop ts: TelevisionShop.values()) {
            sb.append(ts.ordinal());
            sb.append(": ");
            sb.append(ts);
            sb.append(" Available Stock: ");
            sb.append(ts.numInStock);
            sb.append("; Minimal Size Available: ");
            sb.append(ts.minDiag);
            sb.append("; Maximal Size Available: ");
            sb.append(ts.maxDiag);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(TelevisionShop.listAllSizes());
        System.out.println(TelevisionShop.listSizeOf(TelevisionShop.SAMSUNG));
        System.out.println(TelevisionShop.listAllInfo());
    }

}
