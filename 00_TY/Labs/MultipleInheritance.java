class Vehical {
    public void run() {
        System.out.println("Vehical Runs");
    }
}

class Two_Wheeler extends Vehical {
    @Override
    public void run() {
        System.out.println("It runs on two wheels");
    }
}

class Activa extends Two_Wheeler {
    @Override
    public void run() {
        System.out.println("It runs on four wheels");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Vehical v1 = new Vehical();
        Two_Wheeler Tw1 = new Two_Wheeler();
        Activa A1 = new Activa();

        v1.run();
        Tw1.run();
        A1.run();

       
    }
}
