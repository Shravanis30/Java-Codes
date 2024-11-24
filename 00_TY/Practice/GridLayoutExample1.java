import javax.swing.*;
import java.awt.*;

public class GridLayoutExample1 extends JFrame {
    GridLayoutExample1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        Container c = getContentPane();

        JButton B1 = new JButton("Button_1");
        JButton B2 = new JButton("Button_2");
        JButton B3 = new JButton("Button_3");
        JButton B4 = new JButton("Button_4");
        JButton B5 = new JButton("Button_5");
        JButton B6 = new JButton("Button_6");

        add(B1);  add(B2); add(B3); add(B4); add(B5); add(B6);


        GridLayout GL = new GridLayout(3, 2);
        GL.setHgap(10);
        GL.setVgap(20);
        c.setLayout(GL);


    }
    public static void main(String[] args) {
        GridLayoutExample1 GLE1 = new GridLayoutExample1();
    }
}
