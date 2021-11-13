//Write a program to check the given number is PALINDROME or not?
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int num=n;
		int rev=0;
		while(n!=0)
		{
			rev=(rev*10)+n%10;  // 121 //			|	= (0*10)+(121%10)  => 0+1 =>1 |	= (1*10)+(12%10) => 10+2 =>12 |	= (12*10)+(1%10)  => 120+1 =>121
			n=n/10;				//					|	= 121/10		   => 12	  |	= 12/10		     => 1    	  |	= 1/10		   	  => 0	  
		}						//					|	rev=1 n=12					  |	rev=12 n=1					  |	rev=121 n=0					  
		if(rev==num)
			System.out.println(num +" is a palindrome");
			else
			System.out.println(num +" is not a palindrome");
		
	}

}
