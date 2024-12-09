class PrimeNumberCount
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=2;i<=100;i++)
		{
			if(checkPrime(i)){
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
	return true;
	}
}








