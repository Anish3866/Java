public class L2Q1
{
    public static void main(String[] args)
    {
        int a = 9, b = 13, c = 3;

        double x = a - b / 3.0 + c * 2 - 1;
        float y = a - (float)b / (3 + c) * (2 - 1);
        float z = a - ((float)b / (3 + c) * 2) - 1;

        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);
    }
}
