import java.util.Scanner;
public class L3Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (n % 2 != 0)
		{
			if (n % 3 == 0)
			{
				System.out.println("Number is odd and divisible by 3");
			} 
			else 
			{
				System.out.println("Number is odd but not divisible by 3");
			}
		}
		else
		{
			if (n % 3 == 0)
			{
				System.out.println("Number is even and divisible by 3");
			}
			else
			{
				System.out.println("Number is even but not divisible by 3");
			}
		}
	}
}
