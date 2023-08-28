//Write a java Program to check given number is "Even" or "Odd";

import java.util.*;
class Check 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();

		// By using Ternary Operator
		String res=(n%2==0?"Even":"ODD");
		System.out.println(res);

// By using Conditional Statements (if - else)
		//if(n %2==0){
		//	System.out.println( n + " is Even Number ");
		//}
		//else{
		//	System.out.println( n + " is Odd Number ");
		//}
	}
}
