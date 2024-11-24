import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {
    JLabel L1 = new JLabel("Num1");
    JLabel L2 = new JLabel("Num2");
    JLabel L3 = new JLabel("Result");

    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JTextField T3 = new JTextField();

    JButton B1 = new JButton("Add");
    JButton B2 = new JButton("Sub");
    JButton B3 = new JButton("Mul");
    JButton B4 = new JButton("Div");

    CalculatorSwing() {
        // Set bounds for labels and text fields
        L1.setBounds(50, 100, 100, 20);
        L2.setBounds(50, 140, 100, 20);
        L3.setBounds(50, 180, 100, 20);

        T1.setBounds(200, 100, 100, 20);
        T2.setBounds(200, 140, 100, 20);
        T3.setBounds(200, 180, 100, 20);

        // Set bounds for buttons
        B1.setBounds(50, 250, 70, 50);
        B2.setBounds(130, 250, 70, 50);
        B3.setBounds(210, 250, 70, 50);
        B4.setBounds(290, 250, 70, 50);

        // Add components to the frame
        add(L1);
        add(L2);
        add(L3);

        add(T1);
        add(T2);
        add(T3);

        add(B1);
        add(B2);
        add(B3);
        add(B4);

        // Set frame properties
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setTitle("Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add action listeners to buttons
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int Num1 = Integer.parseInt(T1.getText());
        int Num2 = Integer.parseInt(T2.getText());

        // Perform operations based on button pressed
        if (e.getSource() == B1) {
            T3.setText(String.valueOf(Num1 + Num2));
        } else if (e.getSource() == B2) {
            T3.setText(String.valueOf(Num1 - Num2));
        } else if (e.getSource() == B3) {
            T3.setText(String.valueOf(Num1 * Num2));
        } else if (e.getSource() == B4) {
            T3.setText(String.valueOf(Num1 / Num2));
        }
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}

