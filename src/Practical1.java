import java.util.Scanner;

public class Practical1
{
	public static void main(String[] args)
	{
		// Change this method call to test new methods.
		Question1();
	}
	
	public static void Question1()
	{
		// Write code that reads in an integer and that outputs the difference between number and -91.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		int result = number + 91;
		System.out.println(number + " - -91 = " + result);
	}
	
	public static void Question2()
	{
		// Write code that prints the phrase "Work is Workship" on three lines, one word per line, with each word justified to the left
		System.out.println("Work");
		System.out.println("is");
		System.out.println("Workship");
	}
	
	public static void Question3()
	{
		// Write code that reads in an integer and that outputs number multiplied by 23.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		int result = number * 23;
		System.out.println(number + " * 23 = " + result);
	}
	
	public static void Question4()
	{
		// Write code that reads in an integer and that outputs the addition of number and 5.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		int result = number + 5;
		System.out.println(number + " + 5 = " + result);
	}
}