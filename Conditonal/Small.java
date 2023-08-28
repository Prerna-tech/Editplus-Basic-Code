//Write a java Program of Smallest of three number
import java.util.*;

class Small 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//int res = a<b?(a<c?a:c):(b<c?b:c);
		//System.out.println(res + " is  Smallest among three number ");

		if(a<b && a<c)
		{
			System.out.println(" A is  Smallest among three number ");
		}
		else if (b<c)
		{
			System.out.println(" B is  Smallest among three number ");
		}
		else{

			System.out.println(" C is  Smallest among three number ");
		}
	}
}
