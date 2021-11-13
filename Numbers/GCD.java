//Write a program to display GCD of two numbers?
import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter Second number: ");
		int b=sc.nextInt();
		int g=gcd(a,b);
		System.out.println("gcd is: "+g);
		sc.close();
	}

	private static int gcd(int a, int b) 
	{
		if(b>a)
			return gcd(b,a);
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

}
