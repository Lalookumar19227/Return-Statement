import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(checkPrime(n))
			System.out.println("The Number is Prime Number");
		else
			System.out.println("The Number is NOT Prime Number");
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








