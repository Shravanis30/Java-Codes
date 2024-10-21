import java.awt.*;

class Lec1 extends Frame {
    Lec1() {
        Button b1 = new Button("Click me");
        add(b1);
        b1.setBounds(50, 100, 90, 30);
        setSize(90, 30);
        setLayout(null);
        setVisible(true);
        setTitle("First Program");
    }

    public static void main(String[] args) {
        Lec1 L1 = new Lec1();
    }
}