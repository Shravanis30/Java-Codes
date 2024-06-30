public class Function1 {
    public static void main(String[] args) {
        System.out.print("Print stars :");
        star(4);
        System.out.print("Print stars :");
        star(8);
        System.out.print("Print stars :");
        star(7);

    }
    static void star(int n) 
    {
        for(int i = 1; i <= n; i++) 
            System.out.print("*");
    }
}
