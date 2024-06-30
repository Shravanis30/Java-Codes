public class Pattern0 {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("No commands passed");
            System.exit(1);
        }
        
        // Extract the arguments
        String arg1 = args[0];
        String arg2 = args[1];
        
        // Display the arguments
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
    }
}
