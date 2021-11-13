/*N=5									i		space		star
	  * * * * * * * * *				    5		0			9
		* * * * * * *					4		1			7
		  * * * * *						3		2			5
		    * * *				    	2		3			3
		      * 			           	1		4			1
	  1 2 3 4 5 									
										i		n-i			(i*2)-1
*/

import java.util.Scanner;
public class Ptrn35
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=n;i>0;i--)				//row 
		{
			for(int j=1;j<=n-i;j++)			//space
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=(i*2)-1;j++)		//stars
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

