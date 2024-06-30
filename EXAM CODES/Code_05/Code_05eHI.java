// 5. What is inheritance and type of inheritance with program.
// hybrid inheritance
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

class RobotDog extends Dog {
    void charge() {
        System.out.println("The robot dog is charging.");
    }
}
    public class Code_05eHI {
    public static void main(String[] args) {
        RobotDog myRobotDog = new RobotDog();
        myRobotDog.eat();   // Inherited from Dog (which implements Animal)
        myRobotDog.play();  // Inherited from Dog (which implements Pet)
        myRobotDog.charge();// Own method
    }
}

    
