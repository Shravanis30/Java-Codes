// // 8. What are different expection handling mechanism? Explain each with a program.
// // checked Exception (IOException)

// // Importing required classes
// import java.io.*;

// class SuperClass {

// // SuperClass doesn't declare any exception
// void method() {
// 	System.out.println("SuperClass");
// }
// }

// // SuperClass inherited by the SubClass
// class SubClass extends SuperClass {

// // method() declaring Checked Exception IOException
// void method() throws IOException {

// 	// IOException is of type Checked Exception
// 	// so the compiler will give Error

// 	System.out.println("SubClass");
// }
// }
// public class Code_08a {
// // Driver code
// public static void main(String args[]) {
// 	SuperClass s = new SubClass();
// 	s.method();
// }
// }
