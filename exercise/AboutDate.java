import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * The month parameter in Java's Calendar class is 0-based, so January is represented by 0, February by 1, and so on.
 * The array indices should be adjusted by -1 when returning the day of the week since Calendar.
 * DAY_OF_WEEK returns values from 1 (Sunday) to 7 (Saturday).
 */
class AboutDate {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if(year > 2000 && year < 3000){
            Calendar c1 = Calendar.getInstance();
            c1.set(year, month-1, day);   
            int d;
            d = c1.get(Calendar.DAY_OF_WEEK);
            String[] str = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                            "THURSDAY", "FRIDAY", "SATURDAY"};
                             
            return str[d-1];
        }
        return null;
    }
}    

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
