import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample1 extends JFrame {
    FlowLayoutExample1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 200, 500, 700);
        Container c = getContentPane();
        
        JButton B1 = new JButton("1");
        JButton B2 = new JButton("2");
        JButton B3 = new JButton("3");
        JButton B4 = new JButton("4");
        JButton B5 = new JButton("5");
        JButton B6 = new JButton("6");
        JButton B7 = new JButton("7");

        c.add(B1); c.add(B2); c.add(B3); c.add(B4); c.add(B5); c.add(B6); c.add(B7);

        FlowLayout FL = new FlowLayout(FlowLayout.CENTER, 5, 6);

        c.setLayout(FL);

    }

    public static void main(String[] args) {
        FlowLayoutExample1 FLE1 = new FlowLayoutExample1();
    }
}
