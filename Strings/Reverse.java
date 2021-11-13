import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence: ");
		String st=sc.nextLine();
		String temp=st;
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println("reverse of "+temp+" is --> "+rev);
	}

}
