//Write a program to find the FACTORIAL of a given number?
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number: ");
	int n=sc.nextInt();
	int fact=1;
	for(int i=n;i>0;i--)
	{
		fact=fact*i;
	}
	System.out.println(n+"!"+" = "+fact);
}
}