class E
{
	static int k;
	int g;
}
class Test1
{
	public static void main(String[] args) 
	{
		E e1=new E();
		E e2=new E();
		e1.k=12;//this object we call for Static variable 
		e2.k=4;//this object we call for Static variable 
		System.out.println(e1.k);
		System.out.println(e2.k);
		e1.g=12;// this object we call for Non-static variable 
		e2.g=4;// this object we call for Non-static variable 
		System.out.println(e1.g);
		System.out.println(e2.g);
	}
}

/* Output of this program is 
4
4
12
4

this o/p shows that 
1. for static variable we need only one copy of variable.
2. For Non-static variable we need different object for each variable.
*/