/*N=5 									i		space		digit
	  5 4 3 2 1          			    5		0			5
		4 3 2 1             			4		1			4
		  3 2 1      					3		2			3
		    2 1     			    	2		3			2
	          1          	           	1		4			1
	   									
	  1 2 3 4 5							i		n-i			i
*/

import java.util.Scanner;
public class Ptrn48
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of lines: ");
		int n=sc.nextInt();
		
		
		for(int i=n;i>0;i--)				//row 
		{
			int k=i;
			for(int j=1;j<=n-i;j++)			//space
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++)		//digits
			{
				System.out.print(k+" ");
				k--;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

