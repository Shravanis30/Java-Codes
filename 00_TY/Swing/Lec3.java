import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lec3 extends JFrame implements ActionListener{
    Container C;
    JButton JB, JB1, JB2;

    Lec3() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);

        C = getContentPane();
        C.setLayout(null);
        C.setBackground(Color.CYAN);

        JB = new JButton("Click Here!!");
        JB.setBounds(100, 100, 150, 30);

        JB1 = new JButton("Click Here!!");
        JB1.setBounds(300, 100, 150, 30);

        JB2 = new JButton("Click Here!!");
        JB2.setBounds(500, 100, 150, 30);

        C.add(JB);
        C.add(JB1);
        C.add(JB2);

        JB.addActionListener(this);
        JB1.addActionListener(this);
        JB2.addActionListener(this);


    }
    // @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == JB) {
            C.setBackground(Color.ORANGE);
        }
        if(e.getSource() == JB1) {
            C.setBackground(Color.LIGHT_GRAY);
        }
        if(e.getSource() == JB2) {
            C.setBackground(Color.YELLOW);
        }
    }
    public static void main(String[] args) {
        Lec3 L3 = new Lec3();
    }
    
}
