import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int r=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		for(int i=2;i<r;++i)
		{
			if(c<r)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
			
		}
	}

}
