//Count how  many Odd and Even are Present in given digits
import java.util.*;
class Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number " );
		int num = sc.nextInt();
		//nt num =123;
		int evencount =0;
		int oddcount=0;
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
				evencount++;
				//System.out.println(evencount +" number are Even Digit number" );
			else
				oddcount++;
				//System.out.println(oddcount +" number are odd Digit number" );
			num=num/10;
		}
		System.out.println(evencount +" number are Even Digit number");
		System.out.println(oddcount +" number are odd Digit number" );
	}
}
