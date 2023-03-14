// Task 3
class Greeting{
    public static void main(String[] args){
        String name = System.console().readLine("Enter ur name: ");
        System.console().printf("Hello %s!\n", name);

        // another way
        System.out.println("Hello " + name + "!");
    }
}