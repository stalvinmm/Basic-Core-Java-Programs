//Write a Program to display the range of ARMSTRONG numbers?
import java.util.Scanner;

public class RangeArmstrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range: ");
		int r=sc.nextInt();
		for(int x=0;x<=r;x++)
		{
			boolean arm=isArmstrong(x);
		if(arm)
			System.out.println(x);
		}
		sc.close();
	}

	private static boolean isArmstrong(int num) {
		int count = CountNum(num);
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int z=temp%10;
			sum=sum+pwr(z,count);
			temp=temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
	}

	private static int pwr(int z, int count) 
	{
		int pw=1;
		while(count>0)
		{
			pw=pw*z;
			count--;
		}
		return pw;
	}

	private static int CountNum(int num) 
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

}
