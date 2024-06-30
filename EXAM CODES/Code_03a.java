// 3. Write the use of “STATIC” and its keyword and “THIS” keyword using program

public class Code_03a {

	// static variable
	static int a = 10;
	static int b;
	
	// static block
	static {
		b = a * 4;
	}

	public static void main(String[] args)
	{

	System.out.println("Value of a : "+a);
	System.out.println("Value of b : "+b);
	}
}

