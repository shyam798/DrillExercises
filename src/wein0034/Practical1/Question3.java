package wein0034.Practical1;

import java.util.Scanner;

public class Question3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		int result = number * 23;
		System.out.println(number + " * 23 = " + result);
	}
}