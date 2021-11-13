/*	N=5
		A B C D E
		A B C D
		A B C
		A B 
		A
*/

import java.util.Scanner;
public class Ptrn25
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=n;i>0;i--)			//row 
		{
			char ch='A';
			for(int j=i;j>0;j--)		//column
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

