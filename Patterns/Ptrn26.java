/*	N=5
		5
		5 4
		5 4 3
		5 4 3 2
		5 4 3 2 1
*/

import java.util.Scanner;
public class Ptrn26
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)			//row 
		{
			int k=n;
			for(int j=1;j<=i;j++)		//column
			{
				System.out.print(k+" ");
				k--;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

