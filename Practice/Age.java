// write a Program to Print who is elligble to give vote On the basis of age;

import java.util.*;
class Age 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age ");
		int age = sc.nextInt();
		if(age>=24)
		{
			if(age<=35)
			{
				System.out.println("Elligible");
			}else
			{
				System.out.println("Too late ");
			}
		}
		else{
		System.out.println("Your kid is Small ");
		}
	}
}
