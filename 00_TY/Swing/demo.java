// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// class demo extends JFrame implements ActionListener {
//     demo() {
//         setSize(800, 800);
//         setLayout(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setTitle("Form");

//         JLabel labelName = new JLabel("Name: ");
//         labelName.setBounds(50, 100, 90, 30);
//         add(labelName);

//         JTextField textFieldName = new JTextField("Enter Your name here...");
//         textFieldName.setBounds(150, 100, 200, 30);
//         add(textFieldName);

//         JCheckBox checkBoxAJP = new JCheckBox("AJP");
//         JCheckBox checkBoxCNS = new JCheckBox("CNS");
//         JCheckBox checkBoxJSP = new JCheckBox("JSP");
//         checkBoxAJP.setBounds(50, 160, 80, 30);
//         checkBoxCNS.setBounds(150, 160, 80, 30);
//         checkBoxJSP.setBounds(250, 160, 80, 30);
//         add(checkBoxAJP);
//         add(checkBoxCNS);
//         add(checkBoxJSP);

//         JRadioButton radioButtonMale = new JRadioButton("Male");
//         JRadioButton radioButtonFemale = new JRadioButton("Female");
//         radioButtonMale.setBounds(50, 220, 100, 30);
//         radioButtonFemale.setBounds(150, 220, 100, 30);
        
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(radioButtonMale);
//         genderGroup.add(radioButtonFemale);
        
//         add(radioButtonMale);
//         add(radioButtonFemale);

//         DefaultListModel<String> listModel = new DefaultListModel<>();
//         listModel.addElement("CS");
//         listModel.addElement("IT");
//         listModel.addElement("CHEM");
//         JList<String> listSubjects = new JList<>(listModel);
//         listSubjects.setBounds(50, 300, 80, 80);
//         add(listSubjects);

//         JComboBox<String> comboBoxCourses = new JComboBox<>();
//         comboBoxCourses.addItem("AJP");
//         comboBoxCourses.addItem("JSP");
//         comboBoxCourses.addItem("CNS");
//         comboBoxCourses.setBounds(50, 400, 100, 30);
//         add(comboBoxCourses);

//         JTextArea textArea = new JTextArea();
//         textArea.setBounds(50, 480, 200, 150);
//         add(textArea);

//         JMenuBar menuBar = new JMenuBar();
//         JMenu menuFile = new JMenu("File");
//         menuFile.add(new JMenuItem("New"));
//         menuFile.add(new JMenuItem("Open"));
//         menuBar.add(menuFile);
//         setJMenuBar(menuBar);

//         JButton buttonSubmit = new JButton("Submit");
//         buttonSubmit.setBounds(50, 680, 80, 50);
//         buttonSubmit.addActionListener(this);
//         add(buttonSubmit);

//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         // Action performed on button click
//     }

//     public static void main(String[] args) {
//         new demo();
//     }
// }

import java.awt.*;

public class demo extends Frame {
    demo() {
        setVisible(true);
        setSize(400, 500);

        Label l = new Label("no");
        TextField tf = new TextField();
        l.setBounds(50, 80, 30, 30);
        tf.setBounds(80, 80, 30, 30);
        add(l);
        add(tf);
        setLayout(null);
    }
    public static void main(String[] args) {
        new demo();
    }
}