import java.util.Scanner;
public class Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celsius degree.");
		float C = sc.nextFloat();

		float F = (C*9/5)+32;

		System.out.println("The Fahrenheit of the given celsius value is = "+F);
	}
}