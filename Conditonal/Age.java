// write a java poogram to  print the Age of voting person that Elligible or not;
import java.util.*;
class Age  
{
	public static void main(String[] args) 
	{
// By using scaanner class
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		//This is already define user value
		//int age =20;
		if (age >=18)
		{
			System.out.println(" Elligible ");
		}
		else {
			System.out.println(" NOT Elligible ");
			}
	 }
}
