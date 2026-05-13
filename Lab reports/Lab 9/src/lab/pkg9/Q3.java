import java.io.*;

public class Q3 {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("1 Ram Kirtipur 9811111111\n");
            fw.write("2 Shyam Kathmandu 9822222222\n");
            fw.write("3 Hari Kirtipur 9833333333\n");

            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            String line;

            System.out.println("Students whose address is Kirtipur:\n");

            while ((line = br.readLine()) != null) {

                String data[] = line.split(" ");

                if (data[2].equalsIgnoreCase("Kirtipur")) {
                    System.out.println("Roll: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Address: " + data[2]);
                    System.out.println("Phone: " + data[3]);
                    System.out.println();
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}