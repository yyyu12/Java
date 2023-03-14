import java.util.ArrayList;

public class IntListWithArrayList {

    private int currentSize;
    private int maxSize;
    private ArrayList<Integer> arrayList;
    
    public IntListWithArrayList(int maxSize) {
        this.maxSize = maxSize;
        arrayList = new ArrayList<>(maxSize);
        currentSize = 0;
    }

    public IntListWithArrayList(int[] intArray) {
        maxSize = intArray.length;
        currentSize = intArray.length;
        arrayList = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            arrayList.add(intArray[i]);
        }
    }

    public ArrayList<Integer> getData() {
        return arrayList;
    }

    public void add(int i) throws IllegalStateException {
        if (currentSize == maxSize) throw new IllegalStateException("Maximum size reached");
        arrayList.add(i);
        currentSize++;
    }

    public void concat(IntListWithArrayList another) throws IllegalStateException {
        if (currentSize + another.currentSize > maxSize) throw new IllegalStateException("Maximum size reached");
        arrayList.addAll(another.arrayList);
        currentSize += another.currentSize;
    }

    public void removeItemsGreaterThan(int limit) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer i: arrayList) {
            if (i <= limit) newArrayList.add(i);
        }
        arrayList = newArrayList;
        currentSize = newArrayList.size();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }

    public static void main(String[] args) {
        IntListWithArrayList il = new IntListWithArrayList(10);
        for (int i = 1; i < 11; i++) {
            il.add(i);
            // System.out.println(il);
        }
        try {
            il.add(11);
        }
        catch (IllegalStateException e) {
            System.out.println("Can not add another integer since maximum capacity is reached");
        }

        il.removeItemsGreaterThan(5);
        System.out.println(il);

        IntListWithArrayList il2 = new IntListWithArrayList(5);
        for (int i = 6; i < 11; i++) {
            il2.add(i);
        }
        il.concat(il2);
        System.out.println(il);

        try {
            il.concat(il2);
        }
        catch (IllegalStateException e) {
            System.out.println("Cannot concatenate since maximum size is reached");
        }

        int[] intArray = {2, 4, 6, 8, 10};
        IntListWithArrayList il3 = new IntListWithArrayList(intArray);
        System.out.println(il3);
        System.out.println(il3.getData());
    }


}
