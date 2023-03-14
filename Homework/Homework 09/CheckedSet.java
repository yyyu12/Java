import java.util.HashSet;

class AlreadyContainedException extends Exception {
    AlreadyContainedException(String message) {
        super(message);
    }
}

public class CheckedSet<T> {
    
    HashSet<T> set;

    public CheckedSet() {
        set = new HashSet<>();
    }

    public void add(T element) throws AlreadyContainedException {
        if (set.contains(element)) throw new AlreadyContainedException("Element already in the set");
        set.add(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public static void main(String[] args) {
        CheckedSet<String> hs = new CheckedSet<>();
        try {
            hs.add("word1");
            hs.add("word2");
            hs.add("word3");
            hs.add("word4");
            hs.add("word5");
            // This should throw an exception
            hs.add("word2");
        }
        catch (AlreadyContainedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(hs.contains("word6"));
    }

}
