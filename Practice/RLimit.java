// Write a Program to Print Reverse limit of Fibnoccii series
import java.util.*;
class RFib
{
	int b =1;
	int a, c;
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