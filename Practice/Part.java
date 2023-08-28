//Write a Program to Print Pattern in Java
import java.util.*;
class Patt 
{
	public static void main(String[] args)
	{
		System.out.println("size : ");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		for (int i=1;i<=size;i++)
		{
			for (int j=1;j<=size;j++)
			{
				System.out.print("*");
			}
		}
		System.out.println(\n);
	}
}
