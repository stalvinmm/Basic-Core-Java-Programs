//Write program to check the given number is STRONG or not?
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int number=sc.nextInt();   //123
		int num=number;
		int n=0;
		int sum=0;
		while(num!=0)
		{
			int fact=1;
			n=num%10;
			for(int j=n;j>0;j--)
			{
				fact=fact*j;
			}
			num=num/10;	
			sum=sum+fact;
		}
		if(sum==number)
		{
			System.out.println("its a strong number");
		}
		else
			System.out.println("its not a strong number");
		
	}
}
