class  H
{
	static int i =1;

	public static void main(String[] args) 
	{
		System.out.println(i);// static variable refer 
		int i=2;// Local Variable refrence
		System.out.println(i);// 
		System.out.println(H.i);// static variable  refer
	}
}


//