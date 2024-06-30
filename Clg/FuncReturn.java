// Design a function area which will return area of rectangle
// when L and B is passed as argument 
public class FuncReturn {
    public static void main(String[] args) {
        int z = area(5, 7) + area(3, 4) + area(6, 8);
        System.out.println("Total area is " + z);
    }
    static int area(int L, int B) { 
        int a = L * B;
        return a;
    }
}
