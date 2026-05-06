import javax.swing.*;
import java.awt.event.*;

public class ActionExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Simple Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel result = new JLabel();

        JButton b = new JButton("Add");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        result.setBounds(50, 150, 100, 30);
        b.setBounds(50, 200, 100, 30);

        f.add(t1); f.add(t2); f.add(result); f.add(b);

        // ActionListener for calculation
        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());

            int sum = a + b1;

            result.setText(String.valueOf(sum)); // show result in frame
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}