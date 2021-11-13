import java.util.Scanner;
 
public class Palindrome2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word:");
		String word=sc.next(); //hello
		char ch[]=word.toCharArray(); //{'h','e','l','l','o'}
		String temp="";
		for(int i=ch.length-1;i>=0;i--)
		{
			temp=temp+ch[i];
		}
		if(temp.equalsIgnoreCase(word))
			System.out.println("Palindrome of "+word+" is: "+temp);
		else
			System.out.println("not a paindrome");
	}

}
