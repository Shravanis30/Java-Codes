public class SpyNumber {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0, product = 1;
        int temp = n;
        while(temp >0)
        {
            int d = temp %10;
            sum += d;
            product *=d;
            temp/=10;

        }
        if(sum == product)
        {
            System.out.println(n + " its a spy number");
        }
        else
        {
            System.out.println(n + " its not a spy number");
        }
    }
}
