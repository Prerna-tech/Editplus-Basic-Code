class A                 
{
	int i; // Non static variable declaration 
	public static void main(String[] args) 
	{
		A a1,a2;
		a1= new A();
		a1.i=1;
		System.out.println(a1.i);
		a2=new A();
		a2.i=2;
		a2.i++;
		System.out.println(a2.i);
	}
}

/* output of this program 
    1 
	3
 */