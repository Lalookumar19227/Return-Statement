class Program1
{
	public static void main(String[] args)
	{
		int x=5;
		
		System.out.println("From main: "+x+"!= "+findFactorial(x));
		System.out.println("From main: "+x+"!= "+(findFactorial(x)+500));
		
	}
	public static int findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	return fact;
	}
}









