class Prime
{
	public static void main(String [] args)
	{
		int n=12;
		boolean flag =true;
		for (int i=2;i<=n-1 ;i++ )
		{
			if(n%i==0)
			{
				System.out.println("Not A Prime");
				flag=false;
				break;
			}
		}
		if(flag)System.out.println(" Prime ");
	}
}