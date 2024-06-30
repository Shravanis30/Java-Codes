// scanner class is widely used to parse text for string & primitive types using regular expressions
import java.util.Scanner;

public class Lec_03 {
    public static void main(String[] args) {

        int size, i;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of array ");

        size = r.nextInt();
        int a[] = new int[size];

        for (i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }

        System.out.println("printed array elements");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
