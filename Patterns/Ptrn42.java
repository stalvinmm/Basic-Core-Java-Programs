/*N=5									i		space		digit
	          1          			    1		4			1
			1 0	1            			2		3			3
		  1 0 1 0 1 					3		2			5
		1 0 1 0 1 0 1			    	4		1			7
	  1 0 1 0 1 0 1 0 1		           	5		0			9
	   									
	  1 2 3 4 5							i		n-i			(2*i)-1
*/

import java.util.Scanner;
public class Ptrn42
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
			for(int j=1;j<=(2*i)-1;j++)		//digits
			{
				System.out.print(j%2+" ");
				
			}
			
			System.out.println();
			sc.close();
		}
	}

}

