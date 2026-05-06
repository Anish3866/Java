import java.util.Scanner;

interface Add {
    int add(int a, int b);
}

interface Subtract {
    int subtract(int a, int b);
}

interface Multiply {
    int multiply(int a, int b);
}

interface Divide {
    double divide(int a, int b);
}

class Calculator implements Add, Subtract, Multiply, Divide {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return a / b;
    }
}

public class L7Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Addition = " + c.add(a,b));
        System.out.println("Subtraction = " + c.subtract(a,b));
        System.out.println("Multiplication = " + c.multiply(a,b));
        System.out.println("Division = " + c.divide(a,b));
    }
}