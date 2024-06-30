
public class commandLineArgu {
    public static int factorial(int num) {
        if (num == 0)    
        return 1;    
      else    
        return(num * factorial(num-1));    
    }
    public static void main(String[] args) {
        // int f = 1;
        int n = Integer.parseInt(args[0]);
        System.out.println("The factorial = " + factorial(n));
    }
}
