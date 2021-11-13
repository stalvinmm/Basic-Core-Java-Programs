import java.util.Scanner;

//wap to count no of upper and lower case letters in a string
public class LetterCases 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String st=sc.nextLine();
		int uc=0, lc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65&&ch<=90)
				lc++;
			else if(ch>=97&&ch<=122)
				uc++;
		}
		System.out.println("uppercase: "+uc);
		System.out.println("lowercase: "+lc);
		sc.close();
	}

}
