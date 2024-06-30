public class MaxOf3 {
    public static void main(String[] args) {
        int a = 69, b = 66, c = 97;
        if(a>b && a>c) {
            System.out.println("A is greatest");
        }
        else if(b>a && b>c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
    }
}
