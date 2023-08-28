class I2 
{
	
	public static void m1()
	{
		System.out.println("M1 Starts");
		System.out.println("M1 Ends");
	}
	public static void m2()
	{
		System.out.println("M2 Starts");
		System.out.println("M2 Ends");
		m1(); // Method calling
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		m2(); // Method calling
		System.out.println("Main ends");
	}
}

