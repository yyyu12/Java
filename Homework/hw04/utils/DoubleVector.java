package utils;

public class DoubleVector {

    private double[] vec;
    private int l;

    public double[] getVec() {return vec;}
    public int getLength() {return l;}
    public double getElem(int index) {return vec[index];}

    public DoubleVector(double[] v) {
        if (v == null) throw new ArrayStoreException();
        vec = v;
        l = v.length;
    }

    public double scalarProduct(DoubleVector dv) {
        double sp = 0.0;
        if (l == dv.getLength()) {
            for (int i = 0; i < l; ++i) {
                sp += vec[i] * dv.getElem(i);
            }
        }
        return sp;
        //else {
        //    System.err.println("The size of the two vectors does not match");
        //    System.exit(1);
        //}
    }

    public DoubleVector sum(DoubleVector dv) {
        double[] s = new double[l];
        if (l == dv.getLength()) {
            for (int i = 0; i < l; ++i) {
                s[i] = vec[i] + dv.getElem(i);
            }
        }
        return new DoubleVector(s);
        //else {
        //    System.err.println("The size of the two vectors does not match");
        //    System.exit(1);
        //}
    }

    public DoubleVector diff(DoubleVector dv) {
        double[] s = new double[l];
        if (l == dv.getLength()) {
            for (int i = 0; i < l; ++i) {
                s[i] = vec[i] - dv.getElem(i);
            }
        }
        return new DoubleVector(s);
        //else {
        //    System.err.println("The size of the two vectors does not match");
        //    System.exit(1);
        //}
    }

    public DoubleVector scalarProduct2(double d) {
        double[] s = new double[l];
        for (int i = 0; i < l; ++i) {
            s[i] = vec[i] * d;
        }
        return new DoubleVector(s);
    }

    @Override
    public String toString() {
        String v = "<";
        for (int i = 0; i < l-1; ++i) {
            v += vec[i] + ",";
        }
        v += vec[l-1] + ">";
        return v;
    }


    

}
