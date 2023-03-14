// exercise 1
public class Perfect {
    public static void main(String[] args){
        int num = Integer.parseInt(System.console().readLine("Enter a integer number: "));
        int sum = 0;
    
        for(int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a perfect number");
        }else{
            System.err.println("The number " + num + " is not a perfect number.");
        }
    }
}