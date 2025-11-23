import java.util.Scanner;
public class Q5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle, Time and Rate.");
		float P = sc.nextFloat();
		float T = sc.nextFloat();
		float R = sc.nextFloat();

		float SI=(P*T*R)/100;

		System.out.println("The Simple Interest of the given inputs is = "+SI);
	}
}