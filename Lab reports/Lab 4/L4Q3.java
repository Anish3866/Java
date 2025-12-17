import java.util.Scanner;
public class L4Q3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0, temp=num;

		while(temp>0)
		{
			int digit = temp%10;
			sum += digit * digit * digit;
			temp/=10;
		}
		if(sum==num)
			System.out.println(num+" is an Armstrong number.");
		else
			System.out.println(num+" is not an Armstrong number.");
	}
}