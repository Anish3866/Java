public class Q4 {
    public static void main(String[] args) {

        // Autoboxing
        int num = 100;
        Integer obj = num;

        System.out.println("Autoboxing:");
        System.out.println("Primitive value: " + num);
        System.out.println("Object value: " + obj);

        // Auto-unboxing
        Integer x = 200;
        int y = x;

        System.out.println("\nAuto-unboxing:");
        System.out.println("Object value: " + x);
        System.out.println("Primitive value: " + y);
    }
}