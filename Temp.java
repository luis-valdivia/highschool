import java.util.Scanner;

public class Temp
{

   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	double fahrenheit;
	double celsius;

	System.out.print("Enter degrees fahrenheit: ");
	fahrenheit = reader.nextDouble();

	celsius = (fahrenheit - 32.0)*5.0/9.0;
	System.out.print("The equivalent in Celsius is ");
	System.out.println(celsius);
	}
}