class PerfectNumber
{
	public static void main(String[] args)
	{
		int count=0;		
		for(int i=1;i<=1000000;i++)
		{
			if(checkPerfect(i))
			{
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static boolean checkPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
	return n==sum;
	}
}








