import javax.swing.*;
import java.awt.event.*;

public class Q1 extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;

    Q1() {
        l1 = new JLabel("Length");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Breadth");
        l2.setBounds(50, 100, 100, 30);

        l3 = new JLabel("Result");
        l3.setBounds(50, 150, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);

        t3 = new JTextField();
        t3.setBounds(150, 150, 150, 30);

        b = new JButton("Calculate");
        b.setBounds(120, 220, 120, 30);

        b.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int length = Integer.parseInt(t1.getText());
        int breadth = Integer.parseInt(t2.getText());

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        t3.setText("Area=" + area + " Perimeter=" + perimeter);
    }

    public static void main(String[] args) {
        new Q1();
    }
}