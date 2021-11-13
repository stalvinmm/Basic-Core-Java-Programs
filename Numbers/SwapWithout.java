//Write a program to Swap two numbers without using 3rd variable?
import java.util.Scanner;

public class SwapWithout 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for a: ");
		int a=sc.nextInt();		//10
		System.out.println("enter the value for b: ");
		int b=sc.nextInt();		//20
		System.out.println("Before Swapping \n a: "+a+" b: "+b +"\n");
		a=a+b; 			//30
		b=a-b;			//30-20=10
		a=a-b;			//30-10
		System.out.println("After Swapping \n a: "+a+" b: "+b);
	}

}
