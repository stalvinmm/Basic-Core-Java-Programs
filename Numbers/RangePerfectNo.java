//Write a program to display RANGE of PERFECT NUMBERS?
import java.util.Scanner;

public class RangePerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range :");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			int sum=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) 
				{
					sum+=j;
				}
			}
			if(sum==i)
				System.out.println(i);
			
		}
	}

}
