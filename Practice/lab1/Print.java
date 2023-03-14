// Task 5
/* Correct it
class Print {
    public static void main() {
        for( int i = 1; i < 4; i++ ) {
            System.out.Println(i/2);
        }
        i = 4;
        System.out.println("Altogether " + i + " numbers are printed!")
    }
}
*/

class Print {
    public static void main(String[] args) {
        int i;
        for( i = 1; i <= 4; i++ ) {
            System.out.println(i/2.0);
        }
        i = 4;
        System.out.println("Altogether " + i + " numbers are printed!");
    }
}