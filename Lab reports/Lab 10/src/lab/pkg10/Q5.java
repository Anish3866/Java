import javax.swing.*;
import java.awt.event.*;

public class Q5 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3;
    JPasswordField p1;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JComboBox<String> cb;
    JTextArea ta;
    JButton b;

    Q5() {

        l1 = new JLabel("Name");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Address");
        l2.setBounds(50, 100, 100, 30);

        l3 = new JLabel("Email");
        l3.setBounds(50, 150, 100, 30);

        l4 = new JLabel("Password");
        l4.setBounds(50, 200, 100, 30);

        l5 = new JLabel("Gender");
        l5.setBounds(50, 250, 100, 30);

        l6 = new JLabel("Hobbies");
        l6.setBounds(50, 300, 100, 30);

        l7 = new JLabel("Country");
        l7.setBounds(50, 350, 100, 30);

        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30);

        t2 = new JTextField();
        t2.setBounds(180, 100, 150, 30);

        t3 = new JTextField();
        t3.setBounds(180, 150, 150, 30);

        p1 = new JPasswordField();
        p1.setBounds(180, 200, 150, 30);

        r1 = new JRadioButton("Male");
        r1.setBounds(180, 250, 70, 30);

        r2 = new JRadioButton("Female");
        r2.setBounds(260, 250, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1 = new JCheckBox("Music");
        c1.setBounds(180, 300, 80, 30);

        c2 = new JCheckBox("Sports");
        c2.setBounds(260, 300, 80, 30);

        c3 = new JCheckBox("Travel");
        c3.setBounds(340, 300, 80, 30);

        String country[] = {"Nepal", "India", "China"};

        cb = new JComboBox<String>(country);
        cb.setBounds(180, 350, 150, 30);

        ta = new JTextArea();
        ta.setBounds(50, 450, 350, 120);

        b = new JButton("Submit");
        b.setBounds(180, 400, 100, 30);

        b.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(t1);
        add(t2);
        add(t3);
        add(p1);

        add(r1);
        add(r2);

        add(c1);
        add(c2);
        add(c3);

        add(cb);

        add(ta);
        add(b);

        setSize(500, 650);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String gender = "";

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String hobbies = "";

        if (c1.isSelected()) {
            hobbies += "Music ";
        }

        if (c2.isSelected()) {
            hobbies += "Sports ";
        }

        if (c3.isSelected()) {
            hobbies += "Travel ";
        }

        ta.setText(
                "Name: " + t1.getText() +
                "\nAddress: " + t2.getText() +
                "\nEmail: " + t3.getText() +
                "\nPassword: " + p1.getText() +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies +
                "\nCountry: " + cb.getSelectedItem()
        );
    }

    public static void main(String[] args) {
        new Q5();
    }
}