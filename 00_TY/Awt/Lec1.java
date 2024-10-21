import java.awt.*;
import java.awt.event.*;

class Lec1 extends Frame implements ActionListener{
    Lec1() {

        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setTitle("Form");

        Label L1 = new Label("Name: ");
        L1.setBounds(50, 100, 90, 30);
        L1.setText("Name : ");
        add(L1);

        TextField F1 = new TextField();
        F1. setBounds(150, 100, 200, 30);
        F1.setText("Enter Your name here...");
        add(F1);

        Checkbox C1 = new Checkbox("AJP", null, true);
        Checkbox C2 = new Checkbox("CNS", null, false);
        Checkbox C3 = new Checkbox("JSP", null, false);
        C1.setBounds(50, 160, 50, 50);
        C2.setBounds(150, 160, 50, 50);
        C3.setBounds(250, 160, 50, 50);
        add(C1);
        add(C2);
        add(C3);

        CheckboxGroup Gender = new CheckboxGroup();
        Checkbox C4 = new Checkbox("Male", Gender, false);
        Checkbox C5 = new Checkbox("Female", Gender, false);
        C4.setBounds(50, 220, 100, 50);
        C5.setBounds(150, 220, 100, 50);
        add(C4);
        add(C5);

        List LS1 = new List(3, true);
        LS1.add("CS");
        LS1.add("IT");
        LS1.add("CHEM");
        LS1.setBounds(50, 300, 80, 80);
        add(LS1);

        Choice Ch1 = new Choice();
        Ch1.add("AJP");
        Ch1.add("JSP");
        Ch1.add("CNS");
        Ch1.setBounds(50, 400, 50, 50);
        add(Ch1);

        TextArea TA1 = new TextArea();
        TA1.setBounds(50, 480, 200, 150);
        add(TA1);

        MenuBar M1 = new MenuBar();
        setMenuBar(M1);
        Menu File = new Menu("File");
        // MenuItem I1, I2;
        File.add(new MenuItem("New"));
        File.add(new MenuItem("Open"));
        M1.add(File);

        Button B1 = new Button("Submit");
        B1.setBounds(50, 680, 80, 50);
        add(B1);
        B1.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        Lec1 L1 = new Lec1();
    }
}
