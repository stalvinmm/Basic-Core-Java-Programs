//Write a Program to check the given number is ARMSTRONG or not?
import java.util.Scanner;	//371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371

public class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num: ");
		int num=sc.nextInt();
		boolean arm=isArmstrong(num);
		if(arm)
			System.out.println("armstrong number");
		else 
			System.out.println("not a armstrong number");
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
