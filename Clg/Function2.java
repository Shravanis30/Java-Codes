// design a function which will display all numbers from 1st argument to 
// 2nd argument 
public class Function2 {
    public static void main(String[] args) {
        display(10, 20);
        System.out.println();
        display(5,12);
        System.out.println();
    }
    static void display(int a , int b)
     {
        for(int i = a; i <= b; i++)
        System.out.print(i + " ");
     }
}
