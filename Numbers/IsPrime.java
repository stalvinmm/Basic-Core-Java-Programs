//Write a program to display PRIME NUMBERS from 1 to n?

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();						//1 is not a prime no. since a no. should be divided by min of 2 numbers
		for(int i=2;i<=n;i++) 					//range of numbers
		{	
			boolean prime = true;				
			for(int j=2;j<=i/2;j++) 			//range of divisors
			{									//the numbers could be divided by 1 or itself and not any other number
					if(i%j==0)	
					{							//so the divisor starts from 2 to n-1
						prime=false;
					}
			}
			if(prime==true)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
