class parent {
    public void FairSkin() {
        System.out.println("Parents skin is fair");
    }
}

class child extends parent {
    @Override
    public void FairSkin() {
        System.out.println("Child also has fair skin");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        parent p1 = new parent();
        child c1 = new child();

        p1.FairSkin();
        c1.FairSkin();
    }
}