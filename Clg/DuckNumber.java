public class DuckNumber {
    public static void main(String[] args) {
        int n = 303;
        int count = 0;
        int originalN = n; // Store the original value of n
        
        while (n != 0) {
            int d = n % 10;
            if (d == 0) {
                count++;
            }
            n = n / 10;
        }
        
        if (count > 0) {
            System.out.println(originalN + " is a duck number");
        } else {
            System.out.println(originalN + " is not a duck number");
        }
    }
} 
