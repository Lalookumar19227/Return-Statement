class AlternatePrimeNumber
{
	public static void main(String[] args)
	{
		int count=0;		int altcount=0;
		for(int i=2;i<=100;i++)
		{
			if(checkPrime(i)){
				count++;
				if(count%2==1){
					System.out.print(i+"  ");
					altcount++;
				}
			}
		}
		System.out.println("\nTotal Such Numbers are: "+altcount);
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








