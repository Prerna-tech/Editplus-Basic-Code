//WAP a program to print maximum Limit of fibnocci Series

import java.util.*;
class Limit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Max Limit  : ");
		int n = sc.nextInt();
		int a=0, b=1, c;
		while (a<=n)
		{
			System.out.println(a +" ");
			c= a+b;
			a=b;
			b=c;
		}
	}
}


//o/p Enter the Max Limit  : 150
// 0,1,1,2,3,5,8,13,21,34,55,89,144
