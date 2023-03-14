import java.util.Arrays;

public class Swap {
    public static <T> void swap(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[] {1,2,3,4,5,6};
        swap(array, 1, 2);
        System.out.println(Arrays.asList(array));
    }
}
