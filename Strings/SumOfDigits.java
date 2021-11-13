//wap to print sum of digits in a string
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: "); //a1b2c3=6
		String st=sc.nextLine();
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i); 
			if(ch>='0'&&ch<='9')
			{
				sum=sum+ch-48;
			}
		}
		System.out.println(sum);
	}

}
