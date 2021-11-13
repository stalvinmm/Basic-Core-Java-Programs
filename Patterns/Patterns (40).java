/*	N=5
		5
		4 5
		3 4 5
		2 3 4 5
		1 2 3 4 5
*/

import java.util.Scanner;
public class Ptrn27
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=n;i>0;i--)			//row 
		{
			for(int j=i;j<=n;j++)		//column
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

