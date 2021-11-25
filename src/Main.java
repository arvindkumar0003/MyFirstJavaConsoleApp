import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);

		double sum= number1 + number2;
		System.out.printf("\nThe sum of both numbers is: %f", sum);

		double diffrance;
		if (number1 > number2)
			diffrance = number1 - number2;
		else 
			diffrance = number2 - number1;

		System.out.printf("\nThe diffrance of both numbers is: %f", diffrance);
		// added diffrenece
		// added comment
		
		// git diff
	}
}
