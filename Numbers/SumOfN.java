//Write a program to display sum of 1 to N numbers

import java.util.Scanner;

public class SumOfN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of N: ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum+=sum;
	}
	System.out.println("total value is "+sum);
	sc.close();
}
}
