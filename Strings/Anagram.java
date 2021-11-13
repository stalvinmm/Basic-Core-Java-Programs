//wap to check the string is anagram or not
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string:");//cat
		String s1=sc.nextLine();
		System.out.println("enter second string:");//act
		String s2=sc.nextLine();
		if(s1.length()!=s2.length())
			System.out.println("its not a panagram");
		boolean rs=isAnagram(s1,s2);
		if(rs)
			System.out.println("its a panagram");
		else
			System.out.println("its not a panagram");
		sc.close();
	}

	public static boolean isAnagram(String s1, String s2) 
	{
		int count1[]=new int[26];
		int count2[]=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			if(ch1>='a'&&ch1<='z')
				count1[ch1-97]++;
			else if(ch1>='A'&&ch1<='Z')
				count1[ch1-65]++;
		}
		for(int j=0;j<s2.length();j++)
		{
			char ch2=s2.charAt(j);
			if(ch2>='a'&&ch2<='z')
				count2[ch2-97]++;
			else if(ch2>='A'&&ch2<='Z')
				count2[ch2-65]++;
		}
		for(int k=0;k<26;k++)
		{
			if(count1[k]!=count2[k])
				return false;
		}
		return true;
	}
}
