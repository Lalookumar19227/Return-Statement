class StrongNumberInRange
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=10000000;i++)
		{
			if(getSum(i)==i){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Such Numbers are: "+count);
	}
	public static int getSum(int n)
	{
		int sum=0;
		while(n>0){
			sum=sum+getFactorial(n%10);
			n=n/10;
		}
		return sum;
	}
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
	return fact;
	}
}








