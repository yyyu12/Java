import java.util.ArrayList;
import java.util.Arrays;

class StrArray {

    /*
    static List<String> getStrSameBeginningAndEnding(ArrayList<String> strings) {
        List<String> newStrings = new ArrayList<>();
        for (String str: strings) {
            if (str.isEmpty()) continue;
            if (str.charAt(0) == str.charAt(str.length() - 1))
                newStrings.add(str);
        }
        return newStrings;
    }

    static ArrayList<String> removeStrDifferBeginningAndEnding(ArrayList<String> strings) {
        strings.removeIf((String str) -> str.isEmpty() || str.charAt(0) != str.charAt(str.length() - 1));
        return strings;
    }
    */

    static ArrayList<String> removeStrLengthEven(ArrayList<String> strings) {
        strings.removeIf((String str) -> str.length() % 2 == 0);
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList(
            "TesT",
            "abcdefg",
            "32",
            "Hello olleH",
            "",
            "abcCBA",
            "abc",
            "123"
        ));

        System.out.println(strings);
        System.out.println(removeStrLengthEven(strings));
    }

}