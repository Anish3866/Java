import javax.swing.*;
import java.awt.event.*;
import java.io.*;
 public class Time{
     public static void main(String[] args)
     {
         JFrame f = new JFrame("Calculator App");
         
         JLabel l1 = new JLabel("Passenger Name:");
         JLabel l2 = new JLabel("Flight Number:");
         JLabel l3 = new JLabel("Seat Preference:");
         
         l1.setBounds(10,20,60,20);
         l2.setBounds(10,50,60,20);
         l3.setBounds(10,80,60,20);
         
         JTextField f1 = new JTextField();
         JTextField f2 = new JTextField();
         
         f1.setBounds(100,20,100,20);
         f2.setBounds(100,50,100,20);
         
         String s[] = {"Windows","Linux","Mac"};
         JComboBox<String> cb = new JComboBox <>(s);
         cb.setBounds(100,80,100,20);
         
         JCheckBox check = new JCheckBox("I aggree to the terms and condition");
         check.setBounds(30,120,100,20);
         
         JButton b = new JButton("Confirm Booking");
         b.setBounds(70,170,100,20);
         
         f.add(l1);f.add(l2);f.add(l3);f.add(f1);f.add(f2);f.add(cb);f.add(check);f.add(b);
         f.setSize(400,350);
         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);
         
         b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = f1.getText();
                String flight = f2.getText();
                String seat = (String) cb.getSelectedItem();

                if (check.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter("flight.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write("Name: " + name + 
                                 ", Flight: " + flight + 
                                 ", Seat: " + seat);
                        bw.newLine();

                        bw.close();

                        JOptionPane.showMessageDialog(f, "Booking Saved!");

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Accept baggage rules first");
                }
            }
        });
    }
}