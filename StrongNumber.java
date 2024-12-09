import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(getSum(n)==n)
			System.out.println("It is a Strong Number");
		else
			System.out.println("It is NOT a Strong Number");
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








