//Write a program to display nth FIBONACCI number?
import java.util.Scanner;

public class Fibonicci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num: ");
		int n=sc.nextInt();
		int f=fib(n);
		System.out.println(f);
	}

	private static int fib(int n) {
		if(n==1)
		{
			return 0;
		}
		else
		if(n==2)
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
