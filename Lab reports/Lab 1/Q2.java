import java.util.Scanner;
public class Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();

		float add=n1+n2;
		float sub=n1-n2;
		float mul=n1*n2;
		float div=n1/n2;
		System.out.println("The addition of the number is = "+add);
		System.out.println("The subtraction of the number is = "+sub);
		System.out.println("The multiplication of the number is = "+mul);
		System.out.println("The division of the number is = "+div);
	}
}