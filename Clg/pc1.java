class Rectangle {
    private int length, breadth;

    public void area() {
        int a = length * breadth;
        System.out.println("Area = " + a);
    }

    public void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter = " + p);
    }

    public void setdimension(int l, int b) {
        length = l;
        breadth = b;
    }

}

public class pc1 {
    public static void main(String[] args) {
        Rectangle a, b;
        a = new Rectangle();
        b = new Rectangle();
        a.setdimension(3, 7);
        b.setdimension(4, 4);
        a.area();
        a.perimeter();
        b.perimeter();
        b.area();
    }

}
