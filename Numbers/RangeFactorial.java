//Write a program to find the FACTORIAL of a given RANGE of numbers?
import java.util.Scanner;

public class RangeFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range :");
		int range=sc.nextInt();
		for(int j=1;j<=range;j++) 
		{
			int fact=1;
		for(int i=j;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(j+"!"+" = "+fact);
		}
	}

}
