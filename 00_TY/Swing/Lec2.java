import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Lec2 extends JFrame {
    Lec2() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 800);
        setTitle("Introduction to JFrame");

        Container C = getContentPane();
        C.setBackground(Color.gray);

        setResizable(false);

        JLabel L1 = new JLabel("Username");
        L1.setBounds(100, 50, 200, 30);

        Font F1 = new Font("Arial", Font.ITALIC, 30);
        L1.setFont(F1);

        L1.setBackground(Color.RED);
        L1.setForeground(Color.RED);

    }

    public static void main(String[] args) {
  
        Lec2 L2 = new Lec2();
    }
}
