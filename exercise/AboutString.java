import java.io.*;
import java.util.*;

public class AboutString {
    
    public static String capitalize(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }    

    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB = B.length();
        int sum = lenA + lenB;
        System.out.println(sum);
        
        int comparisonResult = A.compareTo(B);
        if(comparisonResult < 0){
            System.out.println("No");
        }else if(comparisonResult > 0){
            System.out.println("Yes");
        }else{
            System.out.println("Equal");
        }
        
        String str1 = capitalize(A);
        String str2 = capitalize(B);
        String concate = str1 + " " + str2;
        System.out.println(concate);
        
        sc.close();
    }
}



