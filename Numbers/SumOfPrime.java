//Write a program to find SUM OF PRIME numbers?

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int r=sc.nextInt();
		int sum=0;
		for(int i=2;i<=r;i++)
		{
			if(isPrime(i))
				sum=sum+i;
		}
		System.out.println("sum is "+sum);
		sc.close();
	}

	private static boolean isPrime(int i) {
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}
	

}
