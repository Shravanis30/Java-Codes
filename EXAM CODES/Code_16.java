// 16. How do you create object in java with example and write difference between object and class.

class Student {
    // Fields
    String name;
    int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method
    public void displayDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

    public class Code_16 {

    public static void main(String[] args) {
        // Creating an object of Student
        Student student1 = new Student("John", 10);

        // Calling method on the object
        student1.displayDetails();  
    }
}