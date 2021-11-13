//wap to count characters
import java.util.Scanner;
public class CountChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String st=sc.nextLine();
		int uc=0, lc=0, dc=0, spc=0, ws=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			else if(ch>='a'&&ch<='z')
				lc++;
			else if(ch>='0'&&ch<='9')
				dc++;
			else if(ch==' ')
				ws++;
			else
				spc++;
		}
		System.out.println("UpperCase:"+uc+"\nLowerCase:"+lc+"\nDigits:"+dc+"\nSpecial:"+spc+"\nWhiteSpace:"+ws);	
	}
}
