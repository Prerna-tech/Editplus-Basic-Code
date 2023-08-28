class Result
{
	int i;
	static int j ;
	static void m1();
	{
		System.out.println(i);
		Result r1 = new Result();
		System.out.println(r1.i);
		System.out.println(j);
	}
}

class Plan
{
	public static void main(String[] args) 
	{
		Result a1 = new Result();
		a1.m1();
	}
}


//		Result a1 = new Result();
//		a1.m1();
//	}
//}

// error: missing method body, or declare abstract
//      void m1();
             