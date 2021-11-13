//Write a program to REVERSE the number?
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: "); //1234
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		System.out.println("after reversing: "+rev);
		sc.close();
	}

}
