/*	N=5
		5 4 3 2 1
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1  
*/

import java.util.Scanner;
public class Ptrn7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)		//row
		{
			for(int j=n;j>0;j--)	//column
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
