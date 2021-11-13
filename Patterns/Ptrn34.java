/*N=5									i		space		star
			  *  						1		4			1
			* * *						2		3			3
		  * * * * *						3		2			5
		* * * * * * *					4		1			7
	  * * * * * * * * *					5		0			9
	  1 2 3 4 5 									
										i		n-i			i+i-1
*/

import java.util.Scanner;
public class Ptrn34
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)				//row 
		{
			for(int j=1;j<=n-i;j++)			//space
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=i+i-1;j++)		//stars
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

