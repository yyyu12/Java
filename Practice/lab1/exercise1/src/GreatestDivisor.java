public class GreatestDivisor {

    public static void main (String[] args){
        if (args.length != 2){
            System.err.println("Invalid input.");
            System.exit(0);
        }else{
            long num1 = Long.parseLong(args[0]);
            long num2 = Long.parseLong(args[1]);
            int gcd = 1;

            for(int i = 1; i <= num1 && i <= num2; i++){
                if(num1 % i == 0 && num2 % i == 0){
                    gcd = i;
                }
            }
            
            System.out.println("The ggreatest common divisor of " + num1 + " and "+ num2 + " is " + gcd + "." );

        }
    }
}
