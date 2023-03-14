public class App {
    public static void main(String[] args) throws Exception {
        String line = "1,2,5,-2 ";
        String[] parts = line.split(",");
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
