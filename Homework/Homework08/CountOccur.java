import java.util.HashMap;

public class CountOccur {

    static String countOccur(String str) {
        HashMap<Character, Integer> charAndOccur = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            charAndOccur.put(c, charAndOccur.containsKey(c) ? charAndOccur.get(c) + 1: 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c: charAndOccur.keySet()) {
            sb.append(c);
            sb.append('(');
            sb.append(charAndOccur.get(c));
            sb.append(')');
        }
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }


    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = "NiceToMeetYou";
        System.out.print(countOccur(s1));
        System.out.print(countOccur(s2));
    }
    
}
