////Write a program to find the FACTORIAL of a given RANGE of numbers?(function method)

import java.util.Scanner;

public class RangeFactorial2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range :");
	int range=sc.nextInt();
	for(int j=1;j<=range;j++) {
	System.out.println(j+"!"+" = "+fact(j));
	}
	sc.close();
}

private static int fact(int j) {
	int fact=1;
	for(int k=j;k>0;k--)
	{
		fact=fact*k;
	}
	
	return fact;
}
}
