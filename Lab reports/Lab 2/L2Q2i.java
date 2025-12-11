public class L2Q2i
{
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		System.out.println("Values before swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);


		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Values after swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
