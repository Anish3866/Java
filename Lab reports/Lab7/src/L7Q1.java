import java.util.Scanner;

class Recursion {

    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class L7Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Recursion r = new Recursion();

        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();

        System.out.println("Factorial = " + r.factorial(num));

        System.out.print("Enter n for Fibonacci term: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci term = " + r.fibonacci(n));

        sc.close();
    }
}