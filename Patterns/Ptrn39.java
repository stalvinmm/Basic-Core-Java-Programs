/*N=5									i		space		digit
	  * * * * *          			    1		4			1
	  *       *	            			2		3			2
	  *  	  *     					3		2			3
	  *       *  				    	4		1			4
	  * * * * * 			           	5		0			5
	   									
	  1 2 3 4 5							i		n-i			i
*/

import java.util.Scanner;
public class Ptrn39
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)				//row 
		{
			for(int j=1;j<=n;j++)			//space
			{
				if(i==1||j==1||i==n||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
			sc.close();
		}
	}

}

