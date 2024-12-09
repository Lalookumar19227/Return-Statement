import java.util.Scanner;
class FactorialSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;	int fact=getFactorial(rem);
			System.out.println(rem+"!= "+fact);	sum=sum+fact;
			n=n/10;
		}
		System.out.println("Total Sum is: "+sum);
	}
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
	return fact;
	}
}








