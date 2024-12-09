class Case2
{
	public static void main(String[] args)
	{
		System.out.println("From main: "+test());	
	}
	public static int test()
	{
		System.out.println("This is test method");
		int x=5;
		if(x>20)
		{
			System.out.println("This is if block");
			return 50;
		}
	System.out.println("This is Outside if block");
	return 100;
	}
}









