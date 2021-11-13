/*N=5									
	1 * * * * *          			    
	2 * *   * *	            			
	3 *   *	  *     					
	4 * *   * *  				    	
	5 * * * * * 			           	
	   									
	  1 2 3 4 5							
*/

import java.util.Scanner;
public class Ptrn40
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
				if(i==1||j==1||i==n||j==n||i==j||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
			sc.close();
		}
	}

}

