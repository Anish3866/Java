import javax.swing.*;
import java.awt.event.*;

public class Q2 extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    Q2() {

        l1 = new JLabel("First Number");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Second Number");
        l2.setBounds(50, 100, 120, 30);

        l3 = new JLabel("Result");
        l3.setBounds(50, 150, 100, 30);

        t1 = new JTextField();
        t1.setBounds(180, 50, 120, 30);

        t2 = new JTextField();
        t2.setBounds(180, 100, 120, 30);

        t3 = new JTextField();
        t3.setBounds(180, 150, 120, 30);

        b1 = new JButton("Add");
        b1.setBounds(70, 220, 100, 30);

        b2 = new JButton("Subtract");
        b2.setBounds(190, 220, 100, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            t3.setText(String.valueOf(a + b));
        }

        if (e.getSource() == b2) {
            t3.setText(String.valueOf(a - b));
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}