//wap to check whether the string is integer or not?
import java.util.Scanner;

public class StringPrimitive 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.next();
		boolean b=isNumber(st);
		if(b==true)
			System.out.println("its a integer");
		else 
			System.out.println("its not a integer");
		
	}

	private static boolean isNumber(String st) //1a2
	{
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=0&&ch<=47||ch>=58&&ch<=127)
				return false;
		}
		return true;
	}

	

}
