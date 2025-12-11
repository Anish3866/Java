import java.util.Scanner;

public class L2Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int total = 0;
		System.out.println("Enter marks of 5 subjects:");
        
		for (int i = 0; i < 5; i++)
		{
			total += sc.nextInt();
		}

		double average = total / 5.0;

		System.out.println("Total Marks = " + total);
		System.out.println("Average Marks = " + average);
    }
}
