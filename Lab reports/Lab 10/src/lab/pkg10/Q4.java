import javax.swing.*;

public class Q4 {

    public static void main(String[] args) {

        String p = JOptionPane.showInputDialog("Enter Principal");
        String r = JOptionPane.showInputDialog("Enter Rate");
        String t = JOptionPane.showInputDialog("Enter Time");

        double principal = Double.parseDouble(p);
        double rate = Double.parseDouble(r);
        double time = Double.parseDouble(t);

        double si = (principal * rate * time) / 100;

        JOptionPane.showMessageDialog(null,
                "Simple Interest = " + si);
    }
}