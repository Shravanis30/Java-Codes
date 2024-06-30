// 5. What is inheritance and type of inheritance with program.
// Multiple inheritance

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

    public class Code_05bMI {  
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Implemented method from Animal
        myDog.play(); // Implemented method from Pet
    }
}
