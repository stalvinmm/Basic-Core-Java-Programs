/*	N=5
		1
		2 3
		4 5 6
		7 8 9 1
		2 3 4 5 6
*/

import java.util.Scanner;
public class Ptrn28
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
				System.out.print(k+" ");
				k++;
				if(k==10)
					k=1;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

