import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        String text = "Java is Object oriented programming";

        try {
            // Writing into file
            FileOutputStream fout = new FileOutputStream("data.txt");
            fout.write(text.getBytes());
            fout.close();

            // Reading from file and counting vowels
            FileInputStream fin = new FileInputStream("data.txt");

            int ch;
            int vowelCount = 0;

            System.out.println("File Content:");

            while ((ch = fin.read()) != -1) {
                char c = (char) ch;
                System.out.print(c);

                c = Character.toLowerCase(c);

                if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            fin.close();

            System.out.println("\nTotal number of vowels: " + vowelCount);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}