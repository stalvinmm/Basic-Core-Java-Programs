//Write program weather to find range of STRONG NUMBER?
import java.util.Scanner;
public class StrongNumRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int range=sc.nextInt();   //150
		for(int i=1;i<=range;i++)
		{
			int sum=0;
			int k=i;
			while(k!=0)
			{
			int num=0;
			num=k%10;
			sum=sum+fact(num);
			k=k/10;
			}
			if(sum==i)
				System.out.println(i);
		}
		
	}

	private static int fact(int num) {
		int factorial=1;
		for(int j=num;j>0;j--){
			factorial=factorial*j;
		}
		return factorial;
	}
}
	