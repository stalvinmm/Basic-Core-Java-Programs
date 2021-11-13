//Write program weather the number is PERFECT NUMBER or not?
import java.util.Scanner; 							// 6 => (multiples) 1+2+3 = 6
						
public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	int n=sc.nextInt();
	int sum=1;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			sum+=i;
	}
	if(n==sum)
		System.out.println("its a perfect number");
		else
		System.out.println("its not a perfect number");
	sc.close();
}
}
