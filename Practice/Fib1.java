// Write a Program to Print Reverse limit of Fibnoccii series
import java.util.*;
class RFib
{
	public static void main(String[] args)
	{
		int b =1;
		int a=0, c;
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();//lower limit
		int n=sc.nextInt();// upper Limit

		while(a<=n)
		{
			if(a>=m)
			{
				c =a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}
}