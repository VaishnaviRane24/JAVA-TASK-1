
// Task 1 : Java Program
public class HelloWorld {

    // Main method : program execution start
    public static void main(String[] args) {

        System.out.println("Hello World");

        // Command line argument
        System.out.println("Arguments Received:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}