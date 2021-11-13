/*N=5	1 2 3 4 5						i		space		star
										5		4			1
	1			*						4		3			2
	2	  	  * *						3		2			3
	3	 	* * *						2		1			4
	4	  *	* * *						1		0			5
	5	* * * *	*						
										i		i-1			n-i+1
*/

import java.util.Scanner;
public class Ptrn33
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=n;i>0;i--)				//row 
		{
			for(int j=1;j<=i-1;j++)			//space
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=n-i+1;j++)		//stars
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

