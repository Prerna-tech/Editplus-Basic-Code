class F 
{
	//static int i =13;
	//static double i =1345;
	static float i =132244f;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		m1();
		System.out.println(F.i);
		F.i=2052217f;
		m1();
		System.out.println("Main ends");
	}
	static int d =45;
	public static void m1()
	{
		System.out.println("m1 starts");
		System.out.println(F.d);
		System.out.println(F.i);
		System.out.println("m1 ends");
	}

}
