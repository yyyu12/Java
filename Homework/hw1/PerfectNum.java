class PerfectNum{
    public static void main(String[] args){
        if(args.length != 1)
            System.err.println("You should give one argument.");
        else{
            int num, sum;
            num = Integer.parseInt(args[0]);

            sum = 0;
            for(int i = 1; i < num; i++)
            {
                if(num % i == 0)
                    sum += i;
            }

            if(num == sum)
                System.out.println("The interger " + num + " is perfect number.");
            else
                System.out.println("The interger " + num + " is not perfect number.");
        }
    }
}