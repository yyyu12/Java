// Task 6
class Half{
    public static void main(String[] args){
        int from, to;
        // To convert a string (provided as input)
        from = Integer.parseInt(System.console().readLine("Give me the lower bound:"));
        to = Integer.parseInt(System.console().readLine("Give me the upper bound:"));

        for(int index = from; index <= to; ++index){
            System.out.println("The half of " + index + " is " + index/2.0);
        }

        //directly convert a string
        int decimal;
        decimal = Integer.parseInt("20");
        System.out.println(decimal);

    }
}