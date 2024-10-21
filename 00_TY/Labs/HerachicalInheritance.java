class Vehical {
    public void run() {
        System.out.println("Vehical Runs on wheels");
    }
}

class Two_Wheeler extends Vehical {
    @Override
    public void run() {
        System.out.println("It runs on two wheels");
    }
}

class Meteor extends Two_Wheeler {
    @Override
    public void run() {
        System.out.println("Meteor is two Wheel Vehical");
    }
}

class Four_Wheeler extends Vehical {
    @Override
    public void run() {
        System.out.println("It runs on four wheels");
    }
}

class Exter extends Four_Wheeler {
    @Override
    public void run() {
        System.out.println("Exter is Four wheel vehical");
    }
}

public class HerachicalInheritance {
    public static void main(String[] args) {
        Vehical v1 = new Vehical();
        Two_Wheeler Tw1 = new Two_Wheeler();
        Four_Wheeler Fw1 = new Four_Wheeler();
        Meteor M1 = new Meteor();
        Exter E1 = new Exter();

        v1.run();
        Tw1.run();
        Fw1.run();
        M1.run();
        E1.run();

    }
}
