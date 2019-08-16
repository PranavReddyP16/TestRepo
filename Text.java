import java.util.Scanner;

public class Text
{
	public static void main(String args[])
	{
		int a;
		int b = 1;
		int i;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Test run in vim");
		System.out.println("Enter a number");

		a = scanner.nextInt();

		for(i=1;i<=a;i++)
		{
			b = b*a;
		}

		System.out.println(a + " to the power of " + a + " is " + b);

	}
}
