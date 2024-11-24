import javax.swing.*;
import java.awt.*;

public class CardLayoutExample1 extends JFrame{
    CardLayoutExample1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 700);
        Container c = getContentPane();

        CardLayout CL = new CardLayout();
        c.setLayout(CL);

        JButton B1 = new JButton("BTN_1");
        JButton B2 = new JButton("BTN_2");
        JButton B3 = new JButton("BTN_3");
        JButton B4 = new JButton("BTN_4");
        JButton B5 = new JButton("BTN_5");

        c.add(B1, "1");
        c.add(B2, "2");
        c.add(B3, "3");
        c.add(B4, "4");
        c.add(B5, "5");


    }
    public static void main(String[] args) {
        CardLayoutExample1 CLE1 = new CardLayoutExample1();
    }
}
