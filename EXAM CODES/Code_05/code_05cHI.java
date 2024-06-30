// 5. What is inheritance and type of inheritance with program.
// Hierarchical Inheritance

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
} 
    public class code_05cHI {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Own method
        
        myCat.eat();  // Inherited from Animal
        myCat.meow(); // Own method
    }
}  

