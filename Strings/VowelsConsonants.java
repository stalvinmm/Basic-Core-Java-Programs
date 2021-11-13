//to count vowels and consonants
import java.util.Scanner;
public class VowelsConsonants 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String st=sc.nextLine();
		int vc=0, cc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			else
				cc++;
			}
		}
		System.out.println("Vowels:"+vc+"\nConsonants:"+cc);
	}

}
