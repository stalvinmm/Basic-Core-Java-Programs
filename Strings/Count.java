//wap to count the characters
import java.util.Scanner;

public class Count 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<128;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i)+" --> "+count[i]);
		}
	}

}
