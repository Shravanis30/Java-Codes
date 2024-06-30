
class Rectangle {
    int length, breath;

    void area() {
        int a = length * breath;
        System.out.println("Area = " + a);
    }

    void perimeter() {
        int p = 2 * (length + breath);
        System.out.println("perimeter = " + p);

    }
}

class pc {
    public static void main(String[] args) {
        Rectangle a, b;
        a = new Rectangle();
        b = new Rectangle();
        a.length = 3;
        a.breath = 4;
        b.length = 5;
        b.breath = 4;
        a.perimeter();
        b.perimeter();
        a.area();
        b.area();
    }
}
