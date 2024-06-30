// 2. What is the constructor give example

class Person {
    
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
    public class Code_02 {
    public static void main(String[] args) {

        // Creating objects using the constructor
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);

        // Displaying details of the persons
        p1.displayDetails();
        p2.displayDetails();     
    }
}

