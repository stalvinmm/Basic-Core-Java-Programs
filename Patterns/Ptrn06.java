/*	N=5
		1 1 1 1 1 
		0 0 0 0 0 
		1 1 1 1 1 
		0 0 0 0 0 
		1 1 1 1 1  
*/

import java.util.Scanner;

public class Ptrn06
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
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
