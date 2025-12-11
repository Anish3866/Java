public class L2Q2ii
{
	public static void main(String[] args)
	{
		int a = 100, b = 200, temp;
		System.out.println("Values before swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("Values after swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
