//Write a java Program to check the given Number is divisible by
//2 and 5 . if the remainder is zero. Print Number is "Lucky number".

import java.util.*;
class Lucky 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String res =( (num%2==0 && num%5==0)?" Lucky Number":" It is not  Lucky number ");
		System.out.println(res);

		//int num =40;
		//if(num%2==0 && num%5==0)
		//{
		//	System.out.println(" Lucky Number");
		//}
		//else{
		//	System.out.println(" It is not  Lucky number ");
		//}		
	}
}
