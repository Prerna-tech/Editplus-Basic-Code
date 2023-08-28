//Write a java Program if student is PASS or FAIL on basis of marks

import java.util.*;

class Grades 
{
	public static void main(String[] args) 
	{
		Scanner sc   = new Scanner(System.in);
		System.out.println(" Enter the Marks : ");
		int num = sc.nextInt();

		if(num>=80 && num<=99)
		{
			System.out.println("Student Got A+ ");
		}
		else if(num>=60 && num<=80)
		{
			System.out.println("Student Got A ");
		}
		else if(num>=45 && num<=60)
		{
			System.out.println("Student Got B+ ");
		}
		else if(num>=35 && num<=45)
		{
			System.out.println("Student Got B ");
		}
		else if(num>=2 && num<=35)
		{
			System.out.println("Student Got C ");
		}

		else{
			System.out.println(" then waste of living and waste of tym ");
		}
	}
}
