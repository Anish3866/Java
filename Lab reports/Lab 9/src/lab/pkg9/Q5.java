import java.util.Vector;
import java.util.Stack;
import java.util.Hashtable;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {

        // Vector Class
        Vector<String> v = new Vector<String>();

        v.add("Java");
        v.add("Python");
        v.add("C++");

        System.out.println("Vector Elements:");

        for (String s : v) {
            System.out.println(s);
        }

        // Stack Class
        Stack<Integer> st = new Stack<Integer>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("\nStack Elements: " + st);

        System.out.println("Popped Element: " + st.pop());

        System.out.println("Stack after pop: " + st);

        // Hashtable Class
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(1, "Ram");
        ht.put(2, "Shyam");
        ht.put(3, "Hari");

        System.out.println("\nHashtable Elements:");

        System.out.println(ht);

        // Random Class
        Random r = new Random();

        System.out.println("\nRandom Numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}