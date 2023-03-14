class PerfectCount{
    public static boolean isPerfectNum(int n){
        int sum;

        sum = 0;
        for(int i = 1; i < n; i++ )
        {
            if(n % i == 0)
                sum += i;
        }

        if(sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        if(args.length != 1)
            System.err.println("You should give one arguments.");
        else{
            int cnt, from, to;

            cnt = 0;
            from = 1;
            to = Integer.parseInt(args[0]);
            
            for(int i = from; i <= to; i++){
                if(isPerfectNum(i))
                    cnt += 1;
            }
            
            System.out.println("It has " + cnt + " perfect numbers." );
        }
    }        
}