/*	N=5
		1 2 3 4 5
		1 2 3 4
		1 2 3 
		1 2 
		1 
*/

import java.util.Scanner;
public class Ptrn18
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)			//row
		{
			for(int j=1;j<=i;j++)		//column
			{
				System.out.print(j+" ");
			}
			System.out.println();
			sc.close();
		}
	}

}

