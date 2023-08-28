// write a java Program to check given year is Leap year or not

import java.util.*;
class Leap 
{
	public static void main(String[] args) 
	{
		Scanner sc   = new Scanner(System.in);
		System.out.println(" Enter the year : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println( "Given year is Leap year ");
		}
		else
		{
			System.out.println(" Given year is  Not Leap year" );
		}
	}
}
