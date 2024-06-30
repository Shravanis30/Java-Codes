public class Practice {
	public static void main(String [] args) {
		int n = 102;
		int count = 0;
		while(n != 0)
		{
			int digit = n % 10;
			if(digit == 0)
			{
				count++;
			}
			n = n/10;
		}
		if(count != 0)
		{
			System.out.println("Its a duck number");
		}
		else
		{
			System.out.println("Its not a duck number");
		}
	}
}
