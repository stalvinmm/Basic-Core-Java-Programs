/*	N=5
		1 
		1 2
		1 2 3  
		1 2 3 4 
		1 2 3 4 5    
*/

import java.util.Scanner;
public class Ptrn15
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
										
		for(int i=1;i<=n;i++)		//row		
		{
			for(int j=1;j<=i;j++)	//column
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}

