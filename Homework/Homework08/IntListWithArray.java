public class IntListWithArray {

    private int currentSize;
    private int maxSize;
    private int[] array;

    public IntListWithArray(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        currentSize = 0;
    }

    public void add(int i) throws IllegalStateException {
        if (currentSize == maxSize) throw new IllegalStateException("Maximum size reached");
        array[currentSize] = i;
        currentSize++;
    }

    public void concat(IntListWithArray another) throws IllegalStateException {
        if (currentSize + another.currentSize > maxSize) throw new IllegalStateException("Maximum size reached");
        for (int i = currentSize; i < currentSize + another.currentSize; i++) {
            array[i] = another.array[i - currentSize];
        }
        currentSize += another.currentSize;
    }

    public void removeItemsGreaterThan(int limit) {
        int[] newArray = new int[maxSize];
        int newSize = 0;
        for (int i = 0; i < currentSize; i++) {
            if (array[i] <= limit) {
                newArray[newSize] = array[i];
                newSize++;
            }
            else continue;
        }
        currentSize = newSize;
    }

    @Override
    public String toString() {
        if (currentSize == 0) return "empty";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < currentSize - 1; i++) {
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.append(array[currentSize - 1]);
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        IntListWithArray il = new IntListWithArray(10);
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

        IntListWithArray il2 = new IntListWithArray(5);
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
    }

}