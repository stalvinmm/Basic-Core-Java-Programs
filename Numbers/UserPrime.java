//Write a program to check whether the given number is PRIME or not?

import java.util.Scanner;

public class UserPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		boolean prime=true;
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
			System.out.println(n+" is a prime");
		else
			System.out.println(n+" is not a prime");
	sc.close();	
	}

}
