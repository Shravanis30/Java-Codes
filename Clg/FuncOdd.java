public class FuncOdd {
    public static void main(String[] args) {
        odd();
    }
    static void odd() 
    {
        for(int i = 1; i <= 100; i+=2)
            System.out.print(i + "\t");
            System.out.println();
    }
}
