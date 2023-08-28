//Write a java Program to greatest of two numbers;

import java .util.*;
class Greatest 
{
	public static void main(String[] args) 
	{
		//int n1,n2;
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		//String res =( n1 > n2 ? (n1 + " is greater than n2 "):( n2  + " is greater than n1"));
		//System.out.println(res);
		
		if (n1>n2)
		{
			System.out.println("N1 is Greatest of two number ");
		}
		else{
			System.out.println("N2 is Greatest of two number ");
		}
	}
}
