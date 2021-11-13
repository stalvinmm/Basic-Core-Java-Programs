/*N=5									i		space		digit
	          1          			    1		4			1
			2 1	            			2		3			2
		  3 2 1  						3		2			3
		4 3 2 1  				    	4		1			4
	  5 4 3 2 1 			           	5		0			5
	   									
	  1 2 3 4 5							i		n-i			i
*/

import java.util.Scanner;
public class Ptrn36
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
			for(int j=i;j>0;j--)		//digits
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

