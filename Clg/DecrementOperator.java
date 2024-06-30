public class DecrementOperator {
    public static void main(String[] args) {
        int x = 10;

        // Post-decrement operator
        int y = x--;
        System.out.println("Post-decrement: x = " + x + ", y = " + y);

        // Pre-decrement operator
        int z = --x;
        System.out.println("Pre-decrement: x = " + x + ", z = " + z);
    }
}
