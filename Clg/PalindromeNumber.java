public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 171;
        int originalNumber = n; 
        int reversedNumber = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            n = n / 10;
        }
        
        if(originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }
}