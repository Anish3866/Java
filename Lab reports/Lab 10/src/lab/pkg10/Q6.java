import javax.swing.*;

public class Q6 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Swing Components");

        // JMenu
        JMenuBar mb = new JMenuBar();

        JMenu menu = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Exit");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        mb.add(menu);

        f.setJMenuBar(mb);

        // JTable
        String data[][] = {
                {"1", "Ram", "Kathmandu"},
                {"2", "Shyam", "Pokhara"},
                {"3", "Hari", "Kirtipur"}
        };

        String column[] = {"ID", "Name", "Address"};

        JTable jt = new JTable(data, column);

        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(20, 20, 300, 100);

        // JDesktopPane and JInternalFrame
        JDesktopPane dp = new JDesktopPane();
        dp.setBounds(20, 150, 350, 180);

        JInternalFrame in = new JInternalFrame(
                "Internal Frame",
                true,
                true,
                true,
                true
        );

        in.setSize(200, 120);
        in.setVisible(true);

        dp.add(in);

        // Add Components
        f.add(sp);
        f.add(dp);

        f.setSize(450, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}