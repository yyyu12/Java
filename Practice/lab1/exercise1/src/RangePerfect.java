// exercise2
public class RangePerfect {
    public static boolean isPerfect(int num){
        int sum = 0;
    
        for(int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }

        
    }

    public static void main(String[] args){
        int num = Integer.parseInt(System.console().readLine("Enter a integer number: "));
        
        for (int i = 1; i <= num; ++i){
            if(isPerfect(i)){
                System.out.println(i + " is a pefect number.");
            }
        }    
    }
}
