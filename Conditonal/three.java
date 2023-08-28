//Write a java Program of greatest of three number

import java.util.Scanner;
class Three 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int res = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(res + " is  greatest among three number ");
	}
}
