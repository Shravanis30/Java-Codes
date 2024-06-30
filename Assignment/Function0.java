// 12.Write a program to design a class rectangle containing data member length, breadth and member function area and perimeter.

class Rectangle {
int length, breadth;

void area()
{
    int a = length * breadth;
System.out.println("Area of rectangle = " + a);
}

void perimeter()
{
    int p = 2*(length+breadth);
System.out.println("Perimeter of rectangle = " + p);
}

}
public class Function0 {
    public static void main (String [] args) {
    Rectangle a, b;
    a = new Rectangle();
    b = new Rectangle();
    a.length = 5;
    a.breadth = 4;
    b.length = 8;
    b.breadth = 3;
    a.area();
    a.perimeter();
    b.area();
    b.perimeter();
    
    }
}
