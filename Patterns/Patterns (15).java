/*	N=5
		5 5 5 5 5
		4 4 4 4 4 
		3 3 3 3 3 
		2 2 2 2 2
		1 1 1 1 1  
*/

import java.util.Scanner;
public class Ptrn08
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)		//row
		{
			for(int j=1;j<=n;j++)	//column
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
