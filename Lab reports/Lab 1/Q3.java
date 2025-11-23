import java.util.Scanner;
public class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width of the rectangle.");
		float L = sc.nextFloat();
		float W = sc.nextFloat();

		float Area = L*W;
		float Perimeter = 2*(L+W);

		System.out.println("The Area of the rectangle is = "+Area);
		System.out.println("The Perimeter of the rectangle is = "+Perimeter);
	}
}