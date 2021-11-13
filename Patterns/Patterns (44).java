/*	N=5
		1
		0 1
		0 1 0
		1 0 1 0
		1 0 1 0 1
*/

import java.util.Scanner;
public class Ptrn31
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		int k=1;
		for(int i=1;i<=n;i++)			//row 
		{
			for(int j=1;j<=i;j++)		//column
			{
				System.out.print(k%2+" ");
				k++;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

