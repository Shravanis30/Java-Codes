// 3. Write the use of “STATIC” and its keyword and “THIS” keyword using program

// Java code for using 'this' keyword to
class Test {
	int a;
	int b;

	// Parameterized constructor
	Test(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		// Displaying value of variables a and b
		System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

	}
}
    public class Code_03b {
	public static void main(String[] args)
	{
		Test object = new Test(10, 20);
		object.display();
	}
}

