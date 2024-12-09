import java.util.Scanner;
class FactorialOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem+"!= "+getFactorial(rem));
			n=n/10;
		}
	}
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
	return fact;
	}
}








