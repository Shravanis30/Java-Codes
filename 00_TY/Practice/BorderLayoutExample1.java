import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample1 extends JFrame {
    BorderLayoutExample1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 500, 700);
        Container c = getContentPane();
        BorderLayout BL = new BorderLayout();
        c.setLayout(BL);

        JButton B1 = new JButton("EAST");
        JButton B2 = new JButton("WEST");
        JButton B3 = new JButton("NORTH");
        JButton B4 = new JButton("SOUTH");
        JButton B5 = new JButton("CENTER");

        c.add(B1, BorderLayout.EAST);
        c.add(B2, BorderLayout.WEST);
        c.add(B3, BorderLayout.NORTH);
        c.add(B4, BorderLayout.SOUTH);
        c.add(B5, BorderLayout.CENTER);

        BL.setHgap(10);
        BL.setVgap(10);

    }
    public static void main(String[] args) {
        BorderLayoutExample1 BLE1 = new BorderLayoutExample1();
    }
}