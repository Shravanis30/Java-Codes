import javax.swing.JOptionPane;

public class ReadingData {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a number : ");
        int N = Integer.parseInt(s);
        for(int i = 1; i <= N; i++)
            System.out.println(i); 
    }
}
