public class ConsoleCipherLogger extends Logger {
    
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String cipher(String s) throws IllegalArgumentException {
        int shift = (int)(100 * Math.random());
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

    @Override
    public void log(String str) {
        System.out.println(cipher(str));
    }

}
