class Stream {

    private int maxStringLength;
    private int stringNumber;
    private Logger logger;

    public static String generateRandomString(int size) {
        String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int)(allChars.length() * Math.random());
            sb.append(allChars.charAt(index));
        }

        return sb.toString();

    }

    public Stream(int maxStringLength, int stringNumber, Logger logger) throws IllegalArgumentException {
        if (maxStringLength <= 0) throw new IllegalArgumentException("String length should be positive");
        if (stringNumber <= 0) throw new IllegalArgumentException("Should generate at least one string");
        this.maxStringLength = maxStringLength;
        this.stringNumber = stringNumber;
        this.logger = logger;
    }

    public void startStreaming() {
        for (int i = 0; i < stringNumber; i++) {
            int l = (int)(maxStringLength * Math.random());
            String str = Stream.generateRandomString(l);
            logger.log(str);
        }
    }

    public static void main(String[] args) {
        Stream stream1 = new Stream(10, 5, new ConsoleLogger());
        stream1.startStreaming();

        System.out.println();
        Stream stream2 = new Stream(10, 5, new ConsoleCipherLogger());
        stream2.startStreaming();

        System.out.println();
        Stream stream3 = new Stream(10, 5, new FileLogger());
        stream3.startStreaming();
    }
}
