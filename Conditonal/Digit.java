//write a java Program to check given number is one digit and two digit

import java.util.*;
class Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc   = new Scanner(System.in);
		System.out.println(" Enter the Digit : ");
		int num = sc.nextInt();

		if(num>=1 && num<=9)
		{
			System.out.println("it is Single digit number ");
		}
		else if (num>=10 && num<=99)
		{
			System.out.println("it is Double digit  number");
		}
	}
}
