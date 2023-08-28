// Write a program to print a Prime  number in reverse Order  
import java.util.*;
class ReversePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = true;
		for(int i=0;i<=a;i++)
		{
			if(i<=1)
				for (int j=2;j<i/2 ;j++ )
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
		if(flag)System.out.println(i);
		}
	}
}
