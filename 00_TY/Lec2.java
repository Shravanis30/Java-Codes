import java.awt.*;

public class Lec2 {
    Lec2() {
        Frame F = new Frame();
        Button B1 = new Button("Click");
        F.add(B1);
        B1.setBounds(20, 80, 80, 30);
        F.setSize(400, 300);
        F.setTitle("2nd Program 'AWT'");
        F.setLayout(null);
        F.setVisible(true);

    }
    public static void main(String[] args) {
        Lec2 L = new Lec2();
    }
}
