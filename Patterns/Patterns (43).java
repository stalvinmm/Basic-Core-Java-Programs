/*	N=5
		1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15
*/

import java.util.Scanner;
public class Ptrn30
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)			//row 
		{
			int k=i;
			for(int j=1;j<=i;j++)		//column
			{
				System.out.print(k+" ");
				k=k+n-j;      //2+5-1
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

