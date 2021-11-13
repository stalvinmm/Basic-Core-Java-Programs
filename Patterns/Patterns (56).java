/*N=5 							    	i		space		digit
	          1          			    1		4			1
			1 2	1            			2		3			3
		  1 2 3 2 1 					3		2			5
		1 2 3 4 3 2 1			    	4		1			7
	  1 2 3 4 5 4 3 2 1		           	5		0			9
	   									
	  1 2 3 4 5							i		n-i			(2*i)-1
*/

import java.util.Scanner;
public class Ptrn43
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
			int k=1;
			for(int j=1;j<=(2*i)-1;j++)		//digits
			{
				System.out.print(k+" ");
				if(j>=i)
					k--;
				else
					k++;
			}
			
			System.out.println();
			sc.close();
		}
	}

}

