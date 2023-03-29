public class Convert {

    // Convert number to string
    public String Convert1(int num){
        String numberAsString;
        numberAsString = Integer.toString(num);
        return numberAsString;
    }

    // Convert number to string
    public String Convert2(int num){
        String str;
        str = String.valueOf(num);
        return str;
    }

    public static void main(String[] args) {
        Convert convert = new Convert();

        String str1;
        String str2;

        str1 = convert.Convert1(123);
        str2 = convert.Convert2(123);

        System.out.println("Convert number to string(by using Integer.toString: " + str1);
        System.out.println("Convert number to string(by using String.valueOf:" + str2);
    }
}
