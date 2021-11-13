import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();  		//malayalam
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		if(rev.equalsIgnoreCase(str))
			System.out.println("its a palindrome");
		else
			System.out.println("not a palindrome");
	}

}
