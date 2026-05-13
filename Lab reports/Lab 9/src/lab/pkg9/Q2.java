import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {

        try {
            // Writing into file
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("This file is written using FileWriter.");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("sample.txt");

            int ch;

            System.out.println("File Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}