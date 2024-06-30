// 13.Write a program to design a class box containing data member l, b, h and member function set dimension and value.

class box {

	private int l, b, h;
	
	public void setDimension(int x, int y , int z) {
		l = x; 
		b = y;
		h = z;
	} 
	
	public void volume () {
		int v = l*b*h;
		System.out.println("Volume = " + v);
	}
}

public class Function1 {
    public static void main (String [] args) {
    	box a, b;
    	a = new box();
    	b = new box();
    	a.setDimension(2, 3, 4);
    	b.setDimension(6, 7, 8);
    	a.volume();
    	b.volume();
    }
}

