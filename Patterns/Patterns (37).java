/*	N=5
		1 1 1 1 1
		0 0 0 0
		1 1 1
		0 0
		1 
*/

import java.util.Scanner;
public class Ptrn24
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		int k=1;
		for(int i=n;i>0;i--)			//row 
		{
			for(int j=i;j>0;j--)		//column
			{
				System.out.print(k%2+" ");
			}
			k++;
			System.out.println();
			sc.close();
		}
	}

}

