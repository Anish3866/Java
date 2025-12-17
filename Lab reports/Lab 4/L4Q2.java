import java.util.Scanner;
public class L4Q2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=1;

		if(num<=1)
		{
			System.out.println("Neither prime nor composite");
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
		}
		if(count==1)
			System.out.println(num+" is the prime number");
		else
			System.out.println(num+" is the composite number");
	}
}