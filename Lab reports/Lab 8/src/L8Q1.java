public class L8Q1 {

    public static void main(String args[]) {

        // Arithmetic Exception
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        }

        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("ArithmeticException block finished");
        }


        // ArrayIndexOutOfBounds Exception
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
        }

        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("ArrayIndexOutOfBoundsException block finished");
        }


        // NumberFormat Exception
        try {
            int num = Integer.parseInt("abc");
        }

        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("NumberFormatException block finished");
        }

    }
}