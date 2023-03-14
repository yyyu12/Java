public class NamedIntList extends IntListWithArrayList {

    private String name;

    public NamedIntList(int maxSize, String name) {
        super(maxSize);
        this.name = name;
    }
    
    public NamedIntList(int[] intArray, String name) {
        super(intArray);
        this.name = name;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": ");
        sb.append(super.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        NamedIntList nil = new NamedIntList(10, "List 1");
        for (int i = 1; i < 11; i++) {
            nil.add(i);
            // System.out.println(il);
        }
        try {
            nil.add(11);
        }
        catch (IllegalStateException e) {
            System.out.println("Can not add another integer since maximum capacity is reached");
        }

        nil.removeItemsGreaterThan(5);
        System.out.println(nil);

        NamedIntList nil2 = new NamedIntList(5, "List 2");
        for (int i = 6; i < 11; i++) {
            nil2.add(i);
        }
        nil.concat(nil2);
        System.out.println(nil);

        try {
            nil.concat(nil2);
        }
        catch (IllegalStateException e) {
            System.out.println("Cannot concatenate since maximum size is reached");
        }

        int[] intArray = {2, 4, 6, 8, 10};
        NamedIntList nil3 = new NamedIntList(intArray, "List 3");
        System.out.println(nil3);
        System.out.println(nil3.getData());
    }
}
