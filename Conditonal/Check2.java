// write a java Program to check given character is UPPERCASE or LOWERCASE and Number;
import java.util.*;
import java.util.Scanner;
class Check2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);


		if (ch>='a' && ch<='z')
		{
			System.out.println(ch + " Given charcter is Lowecase");
		}
		else if(ch>='A' && ch <='Z')
		{
			System.out.println(ch + " Given charcter is Uppercase");
		}
		else if(ch>='0' && ch <='9')
		{
			System.out.println(ch+ " Given charcter is Number ");
		}
		else {
			System.out.println( ch +"  Given charcter is Special Character ");
		}
	}
}
