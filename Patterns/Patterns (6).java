/*	N=5
 		* * * * * 
 		* * * * * 
 		* * * * * 
 		* * * * * 
 		* * * * * 
*/


import java.util.Scanner;
public class Ptrn3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)		//no of rows
		{
			for(int j=1;j<=n;j++)	//no of stars on a row or no of columns
			{
				System.out.print("* ");
			}
				System.out.println();
			sc.close();
		}
	}

}
