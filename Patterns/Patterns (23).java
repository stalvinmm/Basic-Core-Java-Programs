/*	N=5
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E   
*/

import java.util.Scanner;
public class Ptrn10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)		//row
		{
			for(int j=1;j<=n;j++)	//column
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
