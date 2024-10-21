// How to add text field and label
import java.awt.*;
public class Lec3 {
    Lec3() {
        Frame F1 = new Frame();
        Label L = new Label("Student_Id");
        Button B1 = new Button("Submit");
        TextField T1 = new TextField();
        
        L.setBounds(20, 80, 80, 30);
        B1.setBounds(20, 120, 80, 30);
        T1.setBounds(100, 120, 80, 30);

        F1.add(L);
        F1.add(B1);
        F1.add(T1);
        F1.setSize(400, 500);
        F1.setTitle("3rd Program of Awt");
        F1.setLayout(null);
        F1.setVisible(true);
    }
    public static void main(String[] args) {
        Lec3 L3 = new Lec3();
    }
}
