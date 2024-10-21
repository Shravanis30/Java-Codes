class Human {
    public void walk() {
        System.out.println("Human is walking");
    }
}

class Shraavniii extends Human {
    @Override
    public void walk() {
        System.out.println("Shraavniii is walking");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Human h1 = new Human();
        Shraavniii S1 = new Shraavniii();

        h1.walk();
        S1.walk();
    }
}
