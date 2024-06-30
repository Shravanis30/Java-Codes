// 12.Write a program to design a class rectangle containing data member length, breadth and member function area and perimeter.

class Rectangle {
int length, breadth;

void area()
{
System.out.println("Area of rectangle = " + length * breadth);
}

void perimeter()
{
System.out.println("Perimeter of rectangle = " + 2*(length+breadth));
}

}
public class Function {
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
