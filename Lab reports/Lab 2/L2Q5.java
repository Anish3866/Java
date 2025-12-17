import java.util.Scanner;

public class L2Q5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("~a = " + (~a));
		System.out.println("a << 1 = " + (a << 1));
		System.out.println("a >> 1 = " + (a >> 1));
	}
}
