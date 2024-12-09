class PalindromeNumber
{
	public static void main(String[] args)
	{
		int count=0;		
		for(int i=1000;i<=5000;i++)
		{
			if(checkPalindrome(i))
			{
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static boolean checkPalindrome(int n)
	{
		int rev=0;	int a=n;
		while(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
	return rev==a;
	}
}








