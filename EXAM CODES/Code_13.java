// 13. What is abstraction & give example of an abstract class?

// Abstract class
abstract class PersonInfo {
	abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends PersonInfo {
	void printInfo()
	{
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

// main class
public class Code_13 {
	public static void main(String args[])
	{
		PersonInfo s = new Employee();
		s.printInfo();
	}
}
