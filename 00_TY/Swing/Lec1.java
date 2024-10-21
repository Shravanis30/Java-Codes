// import java.awt.*;
// import javax.swing.JFrame;

// public class Lec1 extends JFrame{
//     Lec1() {
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setBounds(100, 100, 1000, 1000);
//         setTitle("Introduction to JFrame");

//         Container C = getContentPane();
//         C.setBackground(Color.pink);

//         setResizable(false);
//     }
//     public static void main(String[] args) {
//         Lec1 J = new Lec1();
//     }
// }
 

import java.awt.*;
import javax.swing.*;

public class Lec1 extends JFrame {
    Lec1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 1000);
        setTitle("Introduction to JFrame");

        Container C = getContentPane();
        C.setBackground(Color.pink);

        setResizable(false);
    }

    public static void main(String[] args) {
        // Ensure the JFrame is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Lec1 J = new Lec1();
            }
        });
    }
}
