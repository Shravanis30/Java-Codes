// 8. Write a program to print division according to the geiven percentage.
// package Assignment;

public class PercentageofStudent {
    public static void main(String [] args) {
    	double per = 78.00;
    	if(per >= 90) 
    		System.out.println("1st class");
    	else if(per >= 80)
    		System.out.println("2nd class");
    	else if(per >= 60)
    		System.out.println("3rd class");
    	else if(per >= 50)
    		System.out.println("4th class");
    	else if(per >= 40)
    		System.out.println("pass");
    	else 
    		System.out.println("Fail");
    }
}
