class Marks 
{
	int Sub1 = 64;
	int Sub2 =39;
	int Sub3 = 56;
	int Sub4 = 84;
	public static void main(String[] args) 
	{
		//int Sub1 = 64;
		//int Sub2 =39;
		//int Sub3 = 56;
		//int Sub4 = 84;
		Marks Avg=new Marks();
		Avg = (Avg.Sub1+Avg.Sub2+Avg.Sub3+Avg.Sub4)/4;
		System.out.println(Avg);
	}
}
