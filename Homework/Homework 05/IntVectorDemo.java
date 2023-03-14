import util.IntVector;

class IntVectorDemo {
    public static void main(String[] args) {
        int[] ns = new int[] {1,2,3};
        IntVector v = new IntVector(ns);
        IntVector v2 = new IntVector(ns);

        System.out.println(v);
        v2.append(4);
        System.out.println(v2);

        int[] ns2 = new int[] {1,2,3,4};
        IntVector v3 = new IntVector(ns2);
        IntVector v4 = IntVector.sum(v2, v3);
        System.out.println(v4);
    }
}