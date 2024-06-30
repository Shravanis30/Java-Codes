// design a class box containing data members l, b, h & member function setDimention and volume

class Box {
    private int l, b, h;

    public void setDimention(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    public void volume() {
        int v = l * b * h;
        System.out.println("Volume = " + v);
    }
}

public class pc2 {
    public static void main(String[] args) {
        Box a, b;
        a = new Box();
        b = new Box();
        a.setDimention(3, 7, 9);
        b.setDimention(4, 4, 4);
        a.volume();
        b.volume();

    }

}
