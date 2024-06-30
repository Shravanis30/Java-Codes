// 9. Write a program to print all the numbers from 100 to 1 which is divisible by 2 or 5
// package Assignment;

public class DivisibleByTwoorFive {
    public static void main (String [] args) {
    for(int i = 1; i <= 100; i++)
    {
    	if(i%2==0 || i%5==0)
    		System.out.print(i + "\t");
    }
    }
}
