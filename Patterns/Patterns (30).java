/*	N=5
		1 * 1 * 1
		1 * 1 * 1
		1 * 1 * 1
		1 * 1 * 1
		1 * 1 * 1    
*/

import java.util.Scanner;
public class Ptrn17
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)			//row
		{
			for(int j=1;j<=n;j++)
			{
				if((j%2)==0)
					System.out.print("* ");
				else
					System.out.print((j%2)+" ");
			}
			System.out.println();
			sc.close();
		}
	}

}

