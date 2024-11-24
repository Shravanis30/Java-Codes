import javax.swing.*;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Display a simple message dialog
        JOptionPane.showMessageDialog(null, "Welcome to Java Swing!", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Ask for user input with an input dialog
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        // Display a confirmation dialog
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);

        // Show a personalized message based on the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Hello, " + name + "! Let's continue!", "Welcome", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.WARNING_MESSAGE);
        }
    }
}
