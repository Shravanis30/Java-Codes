import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample1 extends JFrame {
    BoxLayoutExample1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        Container c = getContentPane();

        JButton B1 = new JButton("B1");
        JButton B2 = new JButton("B2");
        JButton B3 = new JButton("B3");
        JButton B4 = new JButton("B4");
        JButton B5 = new JButton("B5");

        BoxLayout BL = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(BL);
        c.add(B1);  c.add(B2); c.add(B3); c.add(B4); c.add(B5);
        
        B1.setAlignmentX(c.CENTER_ALIGNMENT);
        B2.setAlignmentX(c.CENTER_ALIGNMENT);
        B3.setAlignmentX(c.CENTER_ALIGNMENT);
        B4.setAlignmentX(c.CENTER_ALIGNMENT);
        B5.setAlignmentX(c.CENTER_ALIGNMENT);

    }
    public static void main(String[] args) {
        BoxLayoutExample1 BLE1 = new BoxLayoutExample1();
    }
}
