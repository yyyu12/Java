public class Caesar {
    
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int shift;

    public Caesar(int shift) throws IllegalArgumentException {
        if (shift >= 1 && shift <= 25) {
            this.shift = shift;
        }
        else {
            throw new IllegalArgumentException("Invalid shift value");
        }
    }

    public String cipher(String s) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(Character.toUpperCase(s.charAt(i)));
            if (ALPHABET.contains(c)) {
                int ind = ALPHABET.indexOf(c);
                int newInd = (ind + shift) % 26;
                sb.append(ALPHABET.charAt(newInd));
            }
            else {
                throw new IllegalArgumentException("Character not in the alphabet");
            }
        }
        return sb.toString();
    }

    public String decipher(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(Character.toUpperCase(s.charAt(i)));
            int ind = ALPHABET.indexOf(c);
            int newInd = (ind - shift + 26) % 26;
            sb.append(ALPHABET.charAt(newInd));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ABC";
        Caesar c1 = new Caesar(23);
        System.out.println(c1.cipher(s));
    }
}
